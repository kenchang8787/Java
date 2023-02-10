package kenchang8787.com;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main {
  public static void main(String[] args) {

    // 所有都是參考 https://blog.csdn.net/u011277123/article/details/109485260
    // 基本上嘗試了這麼多種單例, 只有Singleton8, 寫成枚舉, 才能夠達成以下條件
    // 1. 多執行緒下安全
    // 2. 反序列化後還是同一個東西
    // 3. 枚舉不支援反射
    //
    // 但是基本上還是使用內部靜態類去取得單例即可 (Singleton5)
    // 頂多使用 readResolve 加強

    // -- 這是展示反序列化的問題
    //    serializeIssue(6);
    //    serializeIssue(7);

    // -- 這是展示反射的問題
    reflectionIssue7();
    reflectionIssue8();

    System.out.println("END");
  }

  /** 從輸出可以看到, 經過 序列化->反序列化的 Singleton6, 已經是不同物件了 */
  static void serializeIssue(int num) {

    final String filePath = "singleton.data";

    try {
      Object instance;

      if (num == 6) instance = Singleton6.getInstance();
      else if (num == 7) instance = Singleton7.getInstance();
      else return;

      // 物件序列化成文件
      ObjectOutputStream outputStream =
          new ObjectOutputStream(new FileOutputStream(new File(filePath)));
      outputStream.writeObject(instance);

      // 從文件反序列化為物件
      ObjectInputStream inputStream =
          new ObjectInputStream(new FileInputStream(new File(filePath)));
      Object readInstance = inputStream.readObject();

      System.out.println(instance);
      System.out.println(readInstance);

      outputStream.close();
      inputStream.close();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /** 從輸出可以看到, 從反射中獲取Singleton7, 又是不同物件了 */
  static void reflectionIssue7() {

    try {
      Class<Singleton7> objectClass = Singleton7.class;

      Constructor<Singleton7> constructor = objectClass.getDeclaredConstructor();
      constructor.setAccessible(true);

      // 從單例模式獲取
      Singleton7 instance = Singleton7.getInstance();
      // 從反射獲取
      Singleton7 reflectInstance = constructor.newInstance();

      System.out.println(instance);
      System.out.println(reflectInstance);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  /** 從輸出可以看到, 從反射中獲取Singleton8, 出Exception, 因為枚舉不支援反射 */
  static void reflectionIssue8() {

    try {
      Class<Singleton8> objectClass = Singleton8.class;

      Constructor<Singleton8> constructor =
          objectClass.getDeclaredConstructor(String.class, int.class);
      constructor.setAccessible(true);

      // 從單例模式獲取
      Singleton8 instance = Singleton8.getInstance();
      // 從反射獲取
      Singleton8 reflectInstance = constructor.newInstance("Ken", 18);

      System.out.println(instance);
      System.out.println(reflectInstance);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

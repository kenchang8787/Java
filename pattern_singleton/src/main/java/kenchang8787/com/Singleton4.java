package kenchang8787.com;

/** 懶散單例模式 - 用synchronized + volatile實現, 多執行緒下安全 */
public class Singleton4 {

  /**
   * volatile 關鍵字, 確保在多執行緒環境下, instance 是存在主記憶體, 並且每個執行緒都從主記憶體中讀取此值 (因為 Java
   * 的多執行緒會將使用的變數複製到執行緒使用的記憶體中, 處理完畢才會將值的變更同步到主記憶體)
   */
  private static volatile Singleton4 instance = null;

  private Singleton4() {}

  public static Singleton4 getInstance() {

    if (instance == null) {
      synchronized (Singleton4.class) {
        if (instance == null) instance = new Singleton4();
      }
    }

    return instance;
  }
}

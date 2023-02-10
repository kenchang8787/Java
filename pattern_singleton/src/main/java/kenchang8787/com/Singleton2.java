package kenchang8787.com;

/** 懶散單例模式 - 物件在呼叫getInstance時才初使化, 多執行緒下可能不為單一實例, 故請參考 Singleton3 */
public class Singleton2 {

  private static Singleton2 instance = null;

  private Singleton2() {}

  public static Singleton2 getInstance() {
    if (instance == null) instance = new Singleton2();

    return instance;
  }
}

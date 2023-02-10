package kenchang8787.com;

/** 積極單例模式 - 物件在宣告為靜態物件時, 就已經被初始化, 在多執行緒下安全 */
public class Singleton1 {

  private static final Singleton1 instance = new Singleton1();

  /** 將建構函數設為私有方法, 如此可避免 instance 被重複取用 */
  private Singleton1() {}

  public static Singleton1 getInstance() {
    return instance;
  }
}

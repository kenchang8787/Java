package kenchang8787.com;

/** 懶散單例模式 - 用靜態內部類實現, 多執行緒下安全, 最推薦使用 */
public class Singleton5 {

  private Singleton5() {}

  private static final class InstanceHolder {
    private static final Singleton5 instance = new Singleton5();
  }

  public static Singleton5 getInstance() {

    return InstanceHolder.instance;
  }
}

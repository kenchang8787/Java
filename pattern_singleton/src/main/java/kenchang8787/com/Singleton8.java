package kenchang8787.com;

// 積極模式 - 用枚舉實現, 多執行緒安全
public enum Singleton8 {
  instance;

  public static Singleton8 getInstance() {
    return instance;
  }
}

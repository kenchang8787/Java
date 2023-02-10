package kenchang8787.com;

import java.io.Serializable;

/** 積極模式 - 直接從Singleton1抄過來 ,但支援序列化, 當物件被反序列化時, 單例將不存在 */
public class Singleton6 implements Serializable {

  private static final long sid = 613322115156121231L;

  private static final Singleton6 instance = new Singleton6();

  private Singleton6() {}

  public static Singleton6 getInstance() {
    return instance;
  }
}

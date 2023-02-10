package kenchang8787.com;

import java.io.Serial;
import java.io.Serializable;

/** 積極模式 - 直接從Singleton6抄過來 ,但支援序列化 */
public class Singleton7 implements Serializable {

  private static final long sid = 613322115156121232L;

  private static final Singleton7 instance = new Singleton7();

  private Singleton7() {}

  public static Singleton7 getInstance() {
    return instance;
  }

  // 當物件被 ObjectInputStream 反序列化時,
  // 若有存在 readResolve 方法, 則會使用此方法指定返回的對象
  @Serial
  private Object readResolve() {
    return instance;
  }
}

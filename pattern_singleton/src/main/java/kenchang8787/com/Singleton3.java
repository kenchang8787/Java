package kenchang8787.com;

/** 懶散單例模式 - 用synchronized實現, 多執行緒下安全 */
public class Singleton3 {

  private static Singleton3 instance = null;

  private Singleton3() {}

  // 因為整個系統都要存取這個類別，很可能有多個process或thread同時存取
  // 為了讓線程安全添加synchronized在多線程下確保物件唯一性
  // 但是因為鎖住了整個getInstance, 所以這個方式的效率低下
  // 得盡量讓鎖的地方變小, 才能提高效率
  public static synchronized Singleton3 getInstance() {
    if (instance == null) instance = new Singleton3();

    return instance;
  }
}

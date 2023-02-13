package kenchang8787.com.multi_thread;

public class MultiThread {

  public static void main(String[] args) throws InterruptedException, RuntimeException {

    System.out.println("== App Start ==");

    for (int i = 1; i <= 3; i++) {
      var thread = new MultiThreadThing(i);

      thread.start();
    }

    // 用介面執行多執行緒的好處是
    // 因為 Java 不支援多重繼承, 故多了一點彈性
    // 另外就是也多少降低了耦合
    var runnable1 = new RunnableThing(1);
    var thread1 = new Thread(runnable1);

    var runnable2 = new RunnableThing(2);
    var thread2 = new Thread(runnable2);

    thread1.start();
    // 另外在這裡使用 join 時, 後續的動作會等 thread1 執行完畢才會繼續下去
    thread1.join();
    thread2.start();

    System.out.println("== App End ==");
  }
}

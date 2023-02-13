package kenchang8787.com.multi_thread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MultiThreadThing extends Thread {

  private int threadNum;

  @Override
  public void run() {
    for (int i = 1; i <= 3; i++) {
      System.out.printf("Thread %d: %d%n", threadNum, i);

      // throw exception to show that an exception occurred will not disturb the other thread,
      // even the exception is happened in Main thread.
      if (threadNum == 1 && i == 1) throw new RuntimeException("Thread 1 will broke after print 1");

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

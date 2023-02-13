package kenchang8787.com.multi_thread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RunnableThing implements Runnable {

  private int runnableNum;

  /**
   * When an object implementing interface {@code Runnable} is used to create a thread, starting the
   * thread causes the object's {@code run} method to be called in that separately executing thread.
   *
   * <p>The general contract of the method {@code run} is that it may take any action whatsoever.
   *
   * @see Thread#run()
   */
  @Override
  public void run() {

    for (int i = 1; i <= 5; i++) {
      System.out.printf("Runnable %d: %d%n", runnableNum, i);

      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

package kenchang8787.com.visibility_problem;

public class VisibilityProblem {
  public static void main(String[] args) {

    // 在Java裡，每個執行緒有各自的記憶體空間(working memory)，
    // 當執行完一段操作後，執行緒會再將剛才使用到的變數的值更新到主記憶體(main memory)
    // 其他執行緒則可從主記憶體讀取到變數的最新值。
    // 上述特性加快了程式處理的效率，
    // 但在多執行緒環境裡卻可能為我們帶來變數可視性(visibility)的問題。
    // 即當一個變數的讀取和寫入發生在不同的執行緒時，讀取變數的執行緒有時無法及時看到變數的值的改變(被其他執行緒寫入)，導致資料不一致。
    // 此時，可在變數前加上volatile，此變數會改為不使用各執行緒的working memory，永遠從主記憶體做存取與讀寫。

    //    withoutVolatile();
    withVolatile();
  }

  static int num;

  static void withoutVolatile() {

    // 因為未使用 volatile 關鍵字
    // 故 reader 只讀到 num 的第一次變更
    Thread readerThread =
        new Thread(
            () -> {
              int temp = 0;
              while (true) {
                if (temp != num) {
                  temp = num;
                  System.out.println("reader: value of num = " + num);
                }
              }
            });

    Thread writerThread =
        new Thread(
            () -> {
              for (int i = 0; i < 5; i++) {
                num++;
                System.out.println("writer: changed value to = " + num);

                // 進入睡眠，以讓readerThread有足夠時間讀到int num的改變(因為num++非具原子性的操作，readerThread仍有一定機會讀到錯誤的值)
                try {
                  Thread.sleep(1000);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
              }

              // 離開程式，否則readerThread會一直等待變數int num的值改變
              System.exit(0);
            });

    readerThread.start();
    writerThread.start();
  }

  static volatile int volatileNum;

  static void withVolatile() {
    Thread readerThread =
        new Thread(
            () -> {
              int temp = 0;
              while (true) {
                if (temp != volatileNum) {
                  temp = volatileNum;
                  System.out.println("reader: value of num = " + volatileNum);
                }
              }
            });

    Thread writerThread =
        new Thread(
            () -> {
              for (int i = 0; i < 5; i++) {
                volatileNum++;
                System.out.println("writer: changed value to = " + volatileNum);

                // 進入睡眠，以讓readerThread有足夠時間讀到int num的改變(因為num++非具原子性的操作，readerThread仍有一定機會讀到錯誤的值)
                try {
                  Thread.sleep(1000);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
              }

              // 離開程式，否則readerThread會一直等待變數int num的值改變
              System.exit(0);
            });

    readerThread.start();
    writerThread.start();
  }
}

package kenchang8787.com.flow_control;

import org.jetbrains.annotations.NotNull;

public class FlowControl {

  public static void main(String[] args) {

    breakLoop();
    sumOfArray(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    drawMultiplicationTable();
    drawRectangle(5);
    getHighestCommonFactor(12, 18);
    fibonacci(13);
    System.out.println(recursionSum(1000));
    System.out.println(recursionPower(2, 6));
    System.out.println(recursionFibonacci(13));
  }

  public static void breakLoop() {
    System.out.println();

    outerLoop:
    for (int i = 0; i < 100; i++) {
      System.out.println();
      for (int j = 0; j < 10; j++) {
        System.out.printf("[%d, %d], ", i, j);

        // break the outer loop in the nested loop
        if (i == 5 && j == 5) break outerLoop;
      }
    }
  }

  public static void sumOfArray(int @NotNull ... numbs) {
    System.out.println();

    int total = 0;

    for (int num : numbs) total += num;

    System.out.printf("sumOfArray: %d%n", total);
  }

  public static void drawMultiplicationTable() {
    System.out.println();

    for (int i = 1; i < 9; i++) {
      for (int j = 1; j < 9; j++) {
        System.out.print(" " + (i * j));
      }
      System.out.println();
    }
  }

  public static void drawRectangle(int size) {
    System.out.println();

    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void getHighestCommonFactor(int x, int y) {
    System.out.println();

    int tmp;

    while (x % y != 0) {
      tmp = y;
      y = x % y;
      x = tmp;
    }

    System.out.println("HCF is: " + y);
  }

  public static void fibonacci(int n) {
    System.out.println();

    if (n <= 1) {
      System.out.println(n);
      return;
    }

    // 最新的費氏數是前兩個費氏數相加
    // 故 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

    // fn1, fn2 分別為最新找到的兩個費氏數
    int fn1 = 1;
    int fn2 = 0;

    int temp;

    // 從第三層開始迴圈
    for (int i = 2; i <= n; i++) {
      temp = fn1;
      fn1 += fn2;
      fn2 = temp;
    }

    System.out.println(fn1);
  }

  /** 遞迴做 1+2+3+...+n */
  public static int recursionSum(int n) {

    if (n == 1) return n;

    return n + recursionSum(n - 1);
  }

  /** 遞迴做兩數平方相加 */
  public static int recursionPower(int a, int b) {

    return switch (b) {
      case 0 -> 1;
      case 1 -> a;
      default -> (a * recursionPower(a, b - 1));
    };
  }

  /** 遞迴做費波那契數列 */
  public static int recursionFibonacci(int num) {
    if (num <= 1) {
      return num;
    }
    return recursionFibonacci(num - 1) + recursionFibonacci(num - 2);
  }
}

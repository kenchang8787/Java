package kenchang8787.com;

public class Main {
  public static void main(String[] args) {

    breakContinue();

    sum(new int[] {1, 10, 100, 1000, 10000});

    drawMultiplicationTable();

    drawRectangle(5);

    getHighestCommonFactor(12, 18);

    // fab

    System.out.println();
    System.out.println(recursionSum(100));
    System.out.println();
    System.out.println(recursionPower(2, 6));
    System.out.println();
    System.out.println(recursionFab(5));
  }

  public static void breakContinue() {

    outerLoop:
    for (int i = 0; i < 10; i++) {

      System.out.println();
      innerLoop:
      for (int j = 0; j < 10; j++) {
        System.out.print("[" + i + ", " + j + "], ");

        if (i == 5 && j == 5) {
          break outerLoop;
        }
      }
    }

    System.out.println();
    System.out.println("Loop have been terminated");
  }

  public static void sum(int[] numbs) {
    System.out.println();

    int total = 0;

    for (int numb : numbs) total += numb;

    System.out.println("total: " + total);
  }

  public static void drawMultiplicationTable() {
    System.out.println();

    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
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

  public static int fab(int n) {
    int fn_1 = 1, fn_2 = 0; // 紀錄最近找到的兩個費氏數
    int i, tmp; // i表示目前要找F(i)
    if (n <= 1) return n;
    for (i = 2; i <= n; i++) {
      tmp = fn_1; // 先把fn_1紀錄在tmp
      fn_1 += fn_2; // 最新的費氏數是前面兩個相加
      fn_2 = tmp; // 第二新的就是原先的fn_1
    }
    return fn_1;
  }

  public static int recursionSum(int n) {

    if (n == 1) return 1;

    return n + recursionSum(n - 1);
  }

  public static int recursionPower(int a, int b) {

    return switch (b) {
      case 0 -> 1;
      case 1 -> a;
      default -> (a * recursionPower(a, b - 1));
    };
  }

  public static int recursionFab(int num) {
    if (num <= 1) {
      return num;
    }
    return recursionFab(num - 1) + recursionFab(num - 2);
  }
}

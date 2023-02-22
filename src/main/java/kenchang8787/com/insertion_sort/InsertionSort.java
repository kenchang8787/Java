package kenchang8787.com.insertion_sort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

  public static void main(String[] args) {

    // create random int array to be the input
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.printf("Before: %s%n", Arrays.toString(numbers));

    sort(numbers);

    System.out.printf("After: %s%n", Arrays.toString(numbers));
  }

  private static void sort(int[] numbers) {

    // i從1開始, 因為視numbers[0]單值為已排序的陣列
    for (int i = 1; i < numbers.length; i++) {
      // 要插入的值
      int insertVal = numbers[i];
      // j索引和其左邊都是已排序的陣列
      int j = i - 1;

      // 若當前值 比 插入值 大, 代表 插入值 的位置要再向左尋找 (會執行j-1)
      // 在這之前, 要將j索引值移動至j+1處(第一次進入此迴圈時, j+1=i),
      // j==0 的情況是, insertVal 比所有已排序的值還小
      while (j >= 0 && numbers[j] > insertVal) {

        // 故將j索引值向右移動一格, 下一次迴圈時, numbers[j]
        numbers[j + 1] = numbers[j];
        j--;
      }

      numbers[j + 1] = insertVal;
    }
  }
}

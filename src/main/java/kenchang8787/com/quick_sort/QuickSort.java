package kenchang8787.com.quick_sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

  public static void main(String[] args) {

    // create random int array to be the input
    Random random = new Random();
    int[] numbers = new int[20];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(10000);
    }

    System.out.printf("Before: %s%n", Arrays.toString(numbers));

    sort(numbers);

    System.out.printf("After: %s%n", Arrays.toString(numbers));
  }

  // 利用這個方法, 讓外面call起來比較好看
  private static void sort(int[] arr) {
    sort(arr, 0, arr.length - 1);
  }

  private static void sort(int[] arr, int start, int end) {

    if (start >= end) return;

    // quick sort的基準值使用隨機Index時, 在平均效能表現較好
    int pivotIndex = new Random().nextInt(end - start) + start;
    int pivot = arr[pivotIndex];
    // 但是以下的函數是專門給基準值在最後一個索引所撰寫的
    // 所以這裡要將隨機Index的基準值, 交換到陣列的最後
    swap(arr, pivotIndex, end);

    // 從左至右的索引
    int left = start;
    // 從右至左的索引
    int right = end;

    // 當 left == right 時, 代表已經遍歷了陣列所有元素
    // 成功將 比基準值小的元素都放在左側, 比基準值大的都放在右側
    // 最後只需要將最後 left和right相遇的index和基準值交換即可
    while (left < right) {

      while (left < right && arr[left] <= pivot) left++;
      while (left < right && arr[right] >= pivot) right--;

      swap(arr, left, right);
    }

    swap(arr, right, end);

    sort(arr, start, right - 1);
    sort(arr, right + 1, end);
  }

  private static void swap(int[] ints, int a, int b) {
    int temp = ints[a];
    ints[a] = ints[b];
    ints[b] = temp;
  }
}

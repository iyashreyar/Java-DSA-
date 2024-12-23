
//reverse an array

import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 5, 4, 3, 9 };
    reverse(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

  static void reverse(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }
}

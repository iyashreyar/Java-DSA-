import java.util.Arrays;

public class swapwholearray {
  public static void main(String[] args) {
    int[] arr = { 3, 4, 5, 6, 7 };
    reverse(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int value1, int value2) {
    int temp = arr[value1];
    arr[value1] = arr[value2];
    arr[value2] = temp;
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

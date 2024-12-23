import java.util.Arrays;

public class swapInArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    swap(arr, 0, 2);
    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int value1, int value2) {
    int temp = arr[value1];
    arr[value1] = arr[value2];
    arr[value2] = temp;
  }
}

import java.util.Arrays;

public class CyclicSort {
  public static void main(String[] args) {
    int[] arr = { 5, 1, 4, 3, 2 };
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void sort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correctindex = arr[i] - 1;
      if (arr[i] != arr[correctindex]) {
        // when element isn't at its correct position, just swap it with its correct
        // index
        swap(arr, i, correctindex);
      } else {
        i++;
      }
    }
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}

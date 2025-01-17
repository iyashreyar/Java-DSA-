import java.util.Arrays;

public class SortingMethods {
  public static void main(String[] args) {
    int[] arr = { -4, 87, -365, 967, 0, 436, -473 };
    bubble(arr);
    System.out.println(Arrays.toString(arr));
  }

  // BUBBLE SORT(Stable Sorting Algo)

  static void bubble(int[] arr) {
    boolean swapped;
    // run the steps n-1 times
    for (int i = 0; i < arr.length; i++) {
      swapped = false;
      // for each step, max item will come at the last respective index
      for (int j = 1; j < arr.length - i; j++) {
        // swap if the item is smaller than the previous one
        if (arr[j] < arr[j - 1]) {
          // swap
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
          swapped = true;
        }
      }
      // if ypu did not swap for a particular value of i, it means the array is
      // already sorted and hence stop the program
      if (!swapped) {
        break;
      }
    }
  }

  // INSERTION SORT(Stable Sorting Algo)

  static void insertion(int[] arr) {
    for (int i = 1; i < arr.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
        } else {
          break;
        }
      }
    }
  }

  // SELECTION SORT(Not a Stable Sorting Algo)

  static void selection(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      // find the max item in the remaining index and swap with the correct index
      int last = arr.length - i - 1;
      int maxIndex = getMaxIndex(arr, 0, last);
      swap(arr, maxIndex, last);
    }
  }

  static int getMaxIndex(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
      if (arr[i] > arr[max]) {
        max = i;
      }
    }
    return max;
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

}

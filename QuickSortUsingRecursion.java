
//quick sort using recusion
//choose any element as pivot, after first pass all the elements that are greator than pivot will be on RHS of pivot and all the elements smaller than pivot will be on LHS of pivot
//it is not mandatory that the LHS and RHS are sorted 

import java.util.Arrays;

public class QuickSortUsingRecursion {
  public static void main(String[] args) {
    int[] arr = { 8, 7, 9, 5, 4, 3, 2, 1, 6 };
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  static void quickSort(int[] arr, int low, int hi) {
    if (low >= hi) {
      return;
    }
    int s = low;
    int e = hi;
    int m = s + (e - s) / 2;

    int pivot = arr[m];

    while (s <= e) {
      while (arr[s] < pivot) {
        s++;
      }
      while (arr[e] > pivot) {
        e--;
      }
      if (s <= e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        s++;
        e--;
      }
    }
    // now my pivot is at the correct index, pls sort the remaining parts
    quickSort(arr, low, e);
    quickSort(arr, s, hi);
  }
}

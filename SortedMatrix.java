
//error for finding target as 4 and 7

import java.util.Arrays;

public class SortedMatrix {
  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    System.out.println(Arrays.toString(search(arr, 6)));
  }

  static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
    while (cStart <= cEnd) {
      int mid = cStart + (cEnd - cStart) / 2;
      if (arr[row][mid] == target) {
        return new int[] { row, mid };
      }
      if (arr[row][mid] < target) {
        cStart = mid + 1;
      } else {
        cEnd = mid - 1;
      }
    }
    return new int[] { -1, -1 };
  }

  static int[] search(int[][] arr, int target) {
    int rows = arr.length;
    int cols = arr[0].length; // be cautious, matrix may be empty

    if (rows == 1) {
      return binarySearch(arr, 0, 0, cols - 1, target);
    }

    // Run the loop till two rows are remaining

    int rStart = 0;
    int rEnd = rows - 1;
    int cMid = cols / 2;

    while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
      int mid = rStart + (rEnd - rStart) / 2;

      if (arr[mid][cMid] == target) {
        return new int[] { mid, cMid };
      }
      if (arr[mid][cMid] < target) {
        rStart = mid;
      } else {
        rEnd = mid;
      }
    }

    // now we have 2 rows remaining
    // check whether the target is in the col of two rows

    if (arr[rStart][cMid] == target) {
      return new int[] { rStart, cMid };
    }
    if (arr[rStart + 1][cMid] == target) {
      return new int[] { rStart + 1, cMid };
    }

    // search in 1st half
    if (target <= arr[rStart][cMid - 1]) {
      return binarySearch(arr, rStart, 0, cMid - 1, target);
    }
    // search in 2nd half
    if (target >= arr[rStart][cMid + 1]) {
      return binarySearch(arr, rStart, cMid + 1, cols - 1, target);
    }
    // search in 3rd half
    if (target <= arr[rStart + 1][cMid - 1]) {
      return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
    }
    // search in 4th half
    else {
      return binarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
    }
  }
}
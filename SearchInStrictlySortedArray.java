
//search in a strictly sorted matrix

import java.util.Arrays;

public class SearchInStrictlySortedArray {
  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3, },
        { 4, 5, 6, },
        { 7, 8, 9 }
    };
    int target = 9;
    System.out.println(Arrays.toString(search(arr, target)));
  }

  static int[] BS(int[][] arr, int row, int cStart, int cEnd, int target) {
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
    int row = arr.length;
    int col = arr[0].length;

    if (row == 1) {
      return BS(arr, 0, 0, col - 1, target);
    }
    int rStart = 0;
    int rEnd = row - 1;
    int cMid = col / 2;
    // run this till 2 rows are remaining
    while (rStart < (rEnd - 1)) {
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
    // now you have 2 rows remaining
    if (arr[rStart][cMid] == target) {
      return new int[] { rStart, cMid };
    }
    if (arr[rStart + 1][cMid] == target) {
      return new int[] { rStart + 1, cMid };
    }
    if (arr[rStart][cMid - 1] >= target) {
      return BS(arr, rStart, 0, cMid - 1, target);
    }
    if (arr[rStart][cMid + 1] <= target && target <= arr[rStart][col - 1]) {
      return BS(arr, rStart, cMid + 1, col - 1, target);
    }
    if (arr[rStart + 1][cMid - 1] >= target) {
      return BS(arr, rStart + 1, 0, cMid - 1, target);
    } else {
      return BS(arr, rStart + 1, cMid + 1, col - 1, target);
    }
  }
}

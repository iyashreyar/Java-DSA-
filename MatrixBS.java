
//arr is sorted in a row-wise and column-wise manner
//all the rows and columns are itself in ascending order

import java.util.Arrays;

public class MatrixBS {
  public static void main(String[] args) {
    int[][] arr = {
        { 3, 6, 8 },
        { 4, 7, 9 },
        { 5, 10, 15 }
    };
    System.out.println(Arrays.toString(search(arr, 7)));
  }

  static int[] search(int[][] arr, int target) {
    int r = 0;
    int c = arr.length - 1;

    while (r < arr.length && c >= 0) {
      if (arr[r][c] == target) {
        return new int[] { r, c };
      }
      if (arr[r][c] < target) {
        r++;
      } else {
        c--;
      }
    }
    return new int[] { -1, -1 };
  }
}

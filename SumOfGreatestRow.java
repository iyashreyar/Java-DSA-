
//return the sum of the row that is having greatest sum

public class SumOfGreatestRow {
  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3 },
        { 3, 4, 1 },
        { 1, 4, 2 }
    };
    System.out.println(practice(arr));
  }

  static int practice(int[][] arr) {
    int ans = Integer.MIN_VALUE;
    for (int row = 0; row < arr.length; row++) {
      int sum = 0;
      for (int col = 0; col < arr[row].length; col++) {
        sum += arr[row][col];
      }
      if (sum > ans) {
        ans = sum;
      }
    }
    return ans;
  }
}

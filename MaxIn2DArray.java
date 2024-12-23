
public class MaxIn2DArray {
  public static void main(String[] args) {
    int[][] nums = {
        { 1, 2, 3, 4 },
        { 5, 15, 7 },
        { 8, 9 }
    };
    int ans = maxValue(nums);
    System.out.println(ans);
  }

  static int maxValue(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] > max) {
          max = arr[row][col];
        }
      }
    }
    return max;
  }
}

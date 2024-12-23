public class MinIn2D {
  public static void main(String[] args) {
    int[][] arr = {
        { 23, 4, -1111 },
        { 18, -14, 3, 9 },
        { 78, 199, 34, 56 },
        { 18, 12 }
    };
    System.out.println(Min(arr));
  }

  static int Min(int[][] arr) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] < min) {
          min = arr[i][j];
        }
      }
    }
    return min;
  }
}

public class maxInRange {
  public static void main(String[] args) {
    int[] arr = { 1, 5, 8, 6, 3 };
    System.out.println(maxRange(arr, 2, 4));
  }

  static int maxRange(int[] arr, int start, int end) {
    int maxVal = arr[start];
    for (int i = start; i <= end; i++) {
      if (arr[i] > maxVal) {
        maxVal = arr[i];
      }
    }
    return maxVal;
  }
}
//pivot

public class PivotInArray {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 5, 6, 7, 0, 1 };
    int ans = pivot(arr);
    System.out.println(ans);
  }

  static int pivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }
      if (arr[start] < arr[mid]) {
        start = mid;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
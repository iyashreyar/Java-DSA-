public class PivotInRotatedArray {
  public static void main(String[] args) {
    int[] arr = { 3, 4, 5, 6, 7, 8, 9, 1, 2 };
    System.out.println(findPivot(arr));
  }

  // This will not work for duplicate values in array
  static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {

      int mid = start + (end - start) / 2;

      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (mid <= start) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }
}

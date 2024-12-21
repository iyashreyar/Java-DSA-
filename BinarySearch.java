public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 4, 6, 15, 17, 18, 21 };
    int target = 4;
    System.out.println(search(arr, target));
  }

  static int search(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}

//Find position of an element in a sorted array of infinite numbers
// out of bound error 

public class GfGQ1 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 16, 18, 20, 22, 30, 35 };
    int target = 30;
    System.out.println("Element found at the Index: " + ans(arr, target));
  }

  static int ans(int[] arr, int target) {
    int start = 0;
    int end = 1;

    while (target > arr[end]) {
      int newStart = end + 1;
      end = end + (end - start + 1) * 2;
      start = newStart;
    }
    return search(arr, target, start, end);
  }

  static int search(int[] arr, int target, int start, int end) {

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

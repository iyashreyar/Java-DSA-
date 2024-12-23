
//position of an element in an array of infinite length
//we cannot use arr.length

public class PositionOfElementInInfiniteArr {
  public static void main(String[] args) {
    int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
    int target = 150;
    System.out.println(ans(arr, target));
  }

  static int ans(int[] arr, int target) {
    // we have to find the range
    // we started taking array of size 2 and doubling it till we find the target
    // element in the range
    int start = 0;
    int end = 1;

    while (target > arr[end]) {
      int temp = end + 1; // temporary start
      end = end + (end - start + 1) * 2;
      start = temp;
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

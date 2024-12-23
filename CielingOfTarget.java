
//find the ceiling of a target element
//ceiling = smallest element larger than the target element

public class CielingOfTarget {
  public static void main(String[] args) {
    int[] arr = { -8, -4, -2, 1, 3, 5, 9 };
    int target = 7;
    System.out.println(Ceiling(arr, target));
  }

  static int Ceiling(int[] arr, int target) {
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
    return start;
  }
}

public class Ceiling {
  public static void main(String[] args) {
    int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
    int target = 56;
    System.out.println("Element found at the Index: " + search(arr, target));
  }

  static int search(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    // if target is greator thn last element in array them :
    if (target > arr[end]) {
      return -1;
    }

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

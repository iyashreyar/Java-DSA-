public class RotationCount {
  public static void main(String[] args) {
    int[] arr = { 4, 4, 5, 5, 6, 7, 0, 1, 2 };
    System.out.println(countRotations(arr));
  }

  static int countRotations(int[] arr) {
    int pivot = findPivot(arr);
    return pivot + 1;
  }

  // use this for non-duplicate values
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

  // use this for duplicate values in an array
  static int FindPivot(int[] arr) {
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

      // if elements at start,end and middle are equal then just skip the duplicates
      if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
        // skip the duplicates after checking if the elements at the start and end were
        // not the pivots
        if (arr[start] > arr[start + 1]) {
          return start;
        }
        start++;
        if (arr[end] < arr[end - 1]) {
          return end - 1;
        }
        end--;
      }
      // left side is sorted, so pivot should be in right
      else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
        start = mid - 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}


//https://leetcode.com/problems/find-in-mountain-array/description/

public class LeetCodeQ5 {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 5, 7, 97, 6, 4, 3 };
    int target = 2;
    System.out.println(search(arr, target));
  }

  static int search(int[] arr, int target) {
    int peak = peakOfArray(arr);
    int firstTry = OrderAgnosticBS(arr, target, 0, peak);
    if (firstTry != -1) {
      return firstTry;
    }
    return OrderAgnosticBS(arr, target, peak + 1, arr.length - 1);
  }

  static int peakOfArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] < arr[mid + 1]) {
        // mid is in asc area
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    // you can return start or end coz both are same
    return start;
  }

  static int OrderAgnosticBS(int[] arr, int target, int start, int end) {

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      }

      if (isAsc) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (target < arr[mid]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }
    return -1;
  }

}

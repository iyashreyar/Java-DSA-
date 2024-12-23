
//rotation count of rotated array

public class RotationCountInRBS {
  public static void main(String[] args) {
    int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2, };
    int rotation = RotationCount(arr) + 1;
    System.out.println(rotation);
  }

  static int RotationCount(int[] arr) {
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


//find peak index in mountain array

public class PeakIndex {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 3, 5, 4, 2 };
    System.out.println(peakIndex(arr));
  }

  static int peakIndex(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < arr[mid + 1]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return start;
  }
}

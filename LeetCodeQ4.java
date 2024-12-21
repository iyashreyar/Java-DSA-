
//https://leetcode.com/problems/find-peak-element/description/

public class LeetCodeQ4 {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 5, 7, 9, 6, 4, 2, 1 };
    System.out.println(search(arr));
  }

  static int search(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < arr[mid + 1]) {
        // mid lies in asc part
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    // we can return start or mid anything coz both are same
    return start;
  }
}

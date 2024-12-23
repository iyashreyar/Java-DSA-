
//search for 3 in the range of index[1,4]

public class SearchInRange {
  public static void main(String[] args) {
    int[] arr = { 18, 12, -7, 3, 14, 28 };
    int ans = search(arr, 18, 1, 4);
    System.out.println(ans);
  }

  static int search(int[] arr, int target, int start, int end) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = start; i <= end; i++) {
      if (target == arr[i]) {
        return i;
      }
    }
    return -1;
  }
}

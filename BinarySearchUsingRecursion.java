
//binary search using recursion

public class BinarySearchUsingRecursion {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 5, 8, 10, 34, 68, 79, 189 };
    int target = 68;
    System.out.println(BS(arr, target, 0, arr.length - 1));
  }

  static int BS(int[] arr, int target, int s, int e) {
    if (s > e) {
      return -1;
    }
    int m = s + (e - s) / 2;
    if (target == arr[m]) {
      return m;
    }
    if (target < arr[m]) {
      return BS(arr, target, s, m - 1);
    }
    return BS(arr, target, m + 1, e);
  }
}


//find a target element in an array

public class FindTargetInArray {
  public static void main(String[] args) {
    int[] arr = { 18, 12, 9, 14, 77, 50 };
    int target = 77;
    int ans = search(arr, target);
    System.out.println(ans);
  }

  static int search(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = 0; i < 6; i++) {
      if (target == arr[i]) {
        return i;
      }
    }
    return -1;
  }
}

public class linearSearch1 {

  static int linear(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 34, 5, 43, 67, 45 };
    int target = 22;
    int ans = linear(nums, target);
    if (ans != -1) {
      System.out.println("Element found at index:" + ans);
    } else {
      System.out.println("Element not found");
    }
  }
}

import java.util.Arrays;

public class LeetCodeQ15 {
  public static void main(String[] args) {
    int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
    System.out.println(majorityElement(arr));
  }

  static int majorityElement(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    return nums[n / 2];
  }
}

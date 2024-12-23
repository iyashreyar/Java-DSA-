
//fist missing positive
// ques - https://leetcode.com/problems/first-missing-positive/

public class LeetCodeQ12 {
  public static void main(String[] args) {
    int[] arr = { 7, 8, 9, 11, 12 };
    System.out.println(firstMissingPositive(arr));
  }

  public static int firstMissingPositive(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correctIndex = nums[i] - 1;
      if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
      } else {
        i++;
      }
    }
    for (int index = 0; index < nums.length; index++) {
      if (nums[index] != index + 1) {
        return index + 1;
      }
    }
    return nums.length + 1;
  }
}

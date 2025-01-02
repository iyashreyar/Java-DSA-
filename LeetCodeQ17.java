
//ques - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

public class LeetCodeQ17 {
  public static void main(String[] args) {
    int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    System.out.println(removeDuplicates(arr));
  }

  static int removeDuplicates(int[] nums) {
    int index = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[index] = nums[i];
        index++;
      }
    }
    return index;
  }
}

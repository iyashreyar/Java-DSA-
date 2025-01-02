
//ques - https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150

public class LeetCodeQ20 {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 2, 2, 3 };
    System.out.println(removeDuplicates(nums));
  }

  static int removeDuplicates(int[] nums) {
    int n = nums.length;
    if (n <= 2) {
    
      return n;
    }

    int j = 2;
    for (int i = 2; i < n; i++) {
      if (nums[i] != nums[j - 2]) {
        nums[j] = nums[i];
        j++;
      }
    }
    return j;
  }
}
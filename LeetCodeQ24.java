
//ques - https://leetcode.com/problems/contains-duplicate/

import java.util.Arrays;

public class LeetCodeQ24 {
  public static void main(String[] args) {
    int[] nums = {1,2,3,1};
    System.out.println(containsDuplicate(nums));
  }
  static boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1;i < nums.length; i++){
      if (nums[i] == nums[i-1]){
        return true;
      }
    }
    return false;
  }
}

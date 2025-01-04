
//https://leetcode.com/problems/two-sum/

import java.util.Arrays;

public class LeetCodeQ23 {
  public static void main(String[] args) {
    int[] arr = {2,7,11,15};
    int target = 18;
    System.out.println(Arrays.toString(twoSum(arr, target)));
  }

  static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] {};
  }
}
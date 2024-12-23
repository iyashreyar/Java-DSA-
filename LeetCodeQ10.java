
//ques - https://leetcode.com/problems/find-all-duplicates-in-an-array/
//find all duplicates in an array of values in range[1,n]

import java.util.ArrayList;
import java.util.List;

public class LeetCodeQ10 {
  public static void main(String[] args) {
    int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
    System.out.println(findDuplicates(nums));
  }

  public static List<Integer> findDuplicates(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correctIndex = nums[i] - 1;
      if (nums[i] != nums[correctIndex]) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
      } else {
        i++;
      }
    }
    List<Integer> ans = new ArrayList<>();
    for (int index = 0; index < nums.length; index++) {
      if (nums[index] != index + 1) {
        ans.add(nums[index]);
      }
    }
    return ans;
  }
}


//ques - https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;

public class LeetCodeQ14 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    rotate(arr, k);
    System.out.println(Arrays.toString(arr));
  }

  static void rotate(int[] nums, int k) {
    k = k % nums.length;
    reverse(nums, 0, nums.length - 1);// {7,6,5,4,3,2,1}
    reverse(nums, 0, k - 1);// {5,6,7,4,3,2,1}
    reverse(nums, k, nums.length - 1);// {5,6,7,1,2,3,4}
  }

  static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}

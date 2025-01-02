
//ques - https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;

public class LeetCodeQ19 {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int m = 3;
    int[] nums2 = { 2, 5, 6 };
    int n = 3;
    merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));
  }

  static void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int i = m, j = 0; j < n; j++) {
      nums1[i] = nums2[j];
      i++;
    }
    Arrays.sort(nums1);
  }
}
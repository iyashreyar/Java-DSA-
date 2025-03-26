
//ques - https://leetcode.com/problems/merge-sorted-array/description/?envType=problem-list-v2&envId=sorting

import java.util.Arrays;

public class LeetCodeQ44{
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
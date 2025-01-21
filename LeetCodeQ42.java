
import java.util.Arrays;


//ques - https://leetcode.com/problems/intersection-of-two-arrays/

public class LeetCodeQ42 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        int[] ans = new int[Math.max(nums1.length, nums2.length)];

        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    // check is the element is not already in the ans array
                    if(k==0 || ans[k-1]!=nums1[i]){
                        ans[k++]=nums1[i];
                    }
                }
            }
        }
        // Trim the result array to the actual size
        return Arrays.copyOf(ans, k);
    }
}


import java.util.Arrays;

//ques - https://leetcode.com/problems/intersection-of-two-arrays/

public class LeetCodeQ42 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        int[] ans = new int[Math.max(nums1.length, nums2.length)];
        
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    // check is the element is not already in the ans array
                    boolean isDuplicate = false;
                    for(int k = 0; k < index; k++){
                        if (ans[k] == nums1[i]){
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate){
                        ans[index++] = nums1[i];
                    }
                    break; // Break to avoid duplicate entries in the ans array
                }
            }
        }
        // Trim the result array to the actual size
        return Arrays.copyOf(ans, index);
    }
}

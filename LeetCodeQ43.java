
import java.util.Arrays;


//ques - https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/?envType=problem-list-v2&envId=sorting

public class LeetCodeQ43 {
    public static void main(String[] args) {
        int[] nums = {9,4,1,7,14,12};//1,4,7,10,12,14
        int k = 3;
        System.out.println(minimumDifference(nums, k));
    }
    static int minimumDifference(int[] nums, int k) {
        if (k == 1){
            return 0;
        }
        Arrays.sort(nums);
        int i = 0;int j = k-1;
        int min = Integer.MAX_VALUE;
        while (j < nums.length){
            min = Math.min(min, nums[j++] - nums[i++]);
        }
        return min;
    }
}
//6
//5
//5
//5

//ques - https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/

import java.util.Arrays;

public class LeetCodeQ41{
    public static void main(String[] args) {
        int[] nums = {7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(nums));
    }
    static double minimumAverage(int[] nums) {
        
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length-1;
        double avg = (nums[s] + nums[e]) / 2.0;
        while (s <= e){
            avg = Math.min(avg, (nums[s] + nums[e]) / 2.0);
            s++;
            e--;
        }
        return avg;
    }
}
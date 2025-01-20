
//ques - https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150

public class LeetCodeQ37{
    public static void main(String[] args) {
        int[] nums = {3,2,0,1,4};
        System.out.println(canJump(nums));
    }
    static boolean canJump(int[] nums) {
        int goal = nums.length -1;
        for (int i = nums.length-2; i >= 0; i--) {
            if (i + nums[i] >= goal){
                goal = i;
            }
        }
        return goal == 0;
    }
}
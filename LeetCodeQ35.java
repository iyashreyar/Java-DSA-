
//ques - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;

public class LeetCodeQ35 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6};
        int target = 7;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] numbers, int target) {
        int left = 0;//0+1 = 1
        int right = numbers.length -1;//3-1= 2

        while (left < right){
            if (numbers[left] + numbers[right] == target){
                return new int[]{left+1, right+1};
            } else if (numbers[left] + numbers[right] < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[] {-1,-1};
    }
}
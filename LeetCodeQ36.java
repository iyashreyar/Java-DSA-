
//ques - https://leetcode.com/problems/plus-one/description/

import java.util.Arrays;

public class LeetCodeQ36 {
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    static public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            } else if (digits[i] == 9){
                digits[i] = 0;
            }
        }
        
        //if the array is like [9,9,9]
        //above code will print ans [0,0,0]
        //but in this situation array size will be increased by one and first index value of increased array should be 1
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
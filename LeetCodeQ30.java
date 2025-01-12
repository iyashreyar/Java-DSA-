
//ques - https://leetcode.com/problems/palindrome-number/

public class LeetCodeQ30 {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
    static boolean isPalindrome(int x) {
        
        int num = x;
        int reverse = 0;

        while(num > 0)
        {
            reverse = (reverse * 10) + num%10;
            num = num/10;
        }

        return reverse == x;
    }
}


//ques - https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150

public class LeetCodeQ34 {
    public static void main(String[] args) {
        String s = "nitin";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {

        if(s.isEmpty()){
            return true;
        }

        int start = 0;
        int end = s.length()-1;

        while(start <= end){

            int currFirst = s.charAt(start);
            int currLast = s.charAt(end);

            if (!Character.isLetterOrDigit(currFirst)){
                start++;
            } else if (!Character.isLetterOrDigit(currLast)){
                end--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}

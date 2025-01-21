
//ques = https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150

public class LeetCodeQ38 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "ahvzgbdcd";
        System.out.println(isSubsequence(s, t));
    }
    static boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()){
            char sChar = s.charAt(i);
            char tChar = t.charAt(j);
            if (sChar == tChar){
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == s.length();
    }
}


import java.util.Arrays;


//ques - https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=top-interview-150

public class LeetCodeQ39 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "naragam";
        System.out.println(isAnagram(s, t));
    }
    static boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a, b);
    }
}

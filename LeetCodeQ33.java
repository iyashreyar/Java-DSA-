
//ques - https://leetcode.com/problems/length-of-last-word/description/?envType=problem-list-v2&envId=string

public class LeetCodeQ33 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        /*
        String[] words = s.trim().split("\\s+");
        return words[words.length-1].length();
         */

        //OR

        //s.trim() function : Removes any leading and trailing whitespace from the string s
        //String s = "  Hello World  ";
        //Output s = "Hello World"

        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}

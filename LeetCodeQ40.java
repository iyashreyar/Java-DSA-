
//ques - https://leetcode.com/problems/reverse-words-in-a-string/description/

public class LeetCodeQ40 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        StringBuilder t = new StringBuilder();
        String[] arr = s.trim().split("\\s+");
        for (int i = arr.length-1; i >= 0; i--) {
            t.append(arr[i]);
            if (i != 0){
                t.append(" ");
            }
        } 
        return t.toString();
    }
}

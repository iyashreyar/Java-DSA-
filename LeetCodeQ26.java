
//ques - https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75

public class LeetCodeQ26 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
    static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length()-1;
        // Move start pointer until it points to a vowel
        while (start < end){
            while (start < end && vowels.indexOf(str[start]) == -1){
                start++;
            }
            // Move end pointer until it points to a vowel
            while (start < end && vowels.indexOf(str[end]) == -1){
                end--;
            }
    
            //Swap the vowels
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
    
            start++;
            end--;
        }
        return new String(str);
    }
}

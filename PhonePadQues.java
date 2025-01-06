
//ques - https://leetcode.com/problems/letter-combinations-of-a-phone-number/

public class PhonePadQues {
    public static void main(String[] args) {
        pad("", "23");
    }
    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        //This is often used to convert a numeric character in a string (like '1', '2', etc.) into its integer value (like 1, 2).
        int digit = up.charAt(0) - '0'; 
        for (int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            pad(p+ch, up.substring(1));
        }
    }
}

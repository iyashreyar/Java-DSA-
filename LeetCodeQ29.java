public class LeetCodeQ29 {
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }
    static int maxScore(String s) {

        //count total ones in the string
        int ones = 0;
        for (int i =0; i< s.length();i++){
            if (s.charAt(i) == '1'){
                ones++;
            }
        }

        //count zeroes in the left substring
        int zeroes = 0;
        int max = Integer.MIN_VALUE;
        for (int i =0; i < s.length()-1; i++){
            if (s.charAt(i) == '0'){
                zeroes++;
            } else {
                ones--;
            }
            max = Math.max(max, zeroes+ones);
        }
        return max;
    }
}
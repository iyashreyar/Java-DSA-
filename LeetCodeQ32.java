
import java.util.Arrays;

public class LeetCodeQ32 {
    public static void main(String[] args) {
        String[] arr = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(arr));
    }
    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String second = strs[strs.length-1];

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            if (first.charAt(i) != second.charAt(i)){
                return ans.toString();
            } else {
                ans.append(first.charAt(i));
            }
        }
        return ans.toString();
    }
}

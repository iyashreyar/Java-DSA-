
//ques - https://leetcode.com/problems/counting-words-with-a-given-prefix/description/?envType=daily-question&envId=2025-01-09

public class LeetCodeQ28 {
    public static void main(String[] args) {
        String[] words = {"leetcode","win","loops","success"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }
    static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}

public class LeetCodeQ28 {
    public static void main(String[] args) {
        String[] words = {"leetcode","win","loops","success"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }
    static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length;i++){
            if (words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}

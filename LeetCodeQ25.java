public class LeetCodeQ25 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "pqrs";
        System.out.println(mergeAlternately(a, b));
    }
    static String mergeAlternately(String a, String b) {
        char[] c = new char[a.length()+b.length()];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length() && j < b.length()){
            c[k] = a.charAt(i);
            i++;
            k++;
            c[k] = b.charAt(j);
            j++;
            k++;
        }
        while (i < a.length()){
            c[k] = a.charAt(i);
            i++;
            k++;
        }
        while (j < b.length()){
            c[k] = b.charAt(j);
            j++;
            k++;
        }
        return new String(c);
    }
}

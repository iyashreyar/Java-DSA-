
import java.util.Arrays;


//ques - https://neetcode.io/problems/is-anagram

public class NeetCodeQ1 {
  public static void main(String[] args) {
    System.out.println(isAnagram("simple", "mislped"));
  }
  static boolean isAnagram(String s, String t) {
    if (s.length()!=t.length()){
      return false;
    }
    char[] sChar = s.toCharArray(); 
    char[] tChar = t.toCharArray(); 
    Arrays.sort(sChar);
    Arrays.sort(tChar);
    return Arrays.equals(sChar,tChar);
  }
}


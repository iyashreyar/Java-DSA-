public class NeetCodeQ2 {
  public static void main(String[] args) {
    String s = "Was it a car or a cat I saw?";
    System.out.println(isPalindrome(s));
  }
  static boolean isPalindrome(String s) {
    StringBuilder newS = new StringBuilder();
    char[] sChar = s.toCharArray();
    for (char c : sChar){
      if (Character.isLetterOrDigit(c)){
        newS.append(Character.toLowerCase(c));
      }
    }
    return newS.toString().equals(newS.reverse().toString());
  }
}

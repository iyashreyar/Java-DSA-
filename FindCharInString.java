
//search for a character in a string

public class FindCharInString {
  public static void main(String[] args) {
    String name = "Yash";
    char target = 'Y';
    boolean ans = search(name, target);
    System.out.println(ans);
  }

  static boolean search(String str, int target) {
    if (str.length() == 0) {
      return false;
    }
    for (int i = 0; i < str.length(); i++) {
      if (target == str.charAt(i)) {
        return true;
      }
    }
    return false;
  }
}

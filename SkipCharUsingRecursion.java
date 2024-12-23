
//skip all the 'a' characters in the given string  (using 1 string in argument)

public class SkipCharUsingRecursion {
  public static void main(String[] args) {
    System.out.println(skip("bcayhsaka"));
  }

  static String skip(String up) {
    if (up.isEmpty()) {
      return "";
    }
    char ch = up.charAt(0);
    if (ch == 'a') {
      return skip(up.substring(1));
    } else {
      return ch + skip(up.substring(1));
    }
  }
}

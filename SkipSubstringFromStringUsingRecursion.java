
//remove or skip a substring from string (eg. skip "mune" from "immuneine")

public class SkipSubstringFromStringUsingRecursion {
  public static void main(String[] args) {
    System.out.println(skip("immuneine"));
  }

  static String skip(String up) {
    if (up.isEmpty()) {
      return "";
    }

    if (up.startsWith("mune")) {
      return skip(up.substring(4));
    } else {
      return up.charAt(0) + skip(up.substring(1));
    }
  }
}

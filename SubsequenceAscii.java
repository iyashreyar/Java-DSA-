
//print all the subsets of a string along with thier ascii values using recursion

public class SubsequenceAscii {
  public static void main(String[] args) {
    subseq("", "abc");
  }
  static void subseq(String p, String up){
    if (up.isEmpty()){
      System.out.println(p);
      return;
    }
    char ch = up.charAt(0);
    subseq(p + ch, up.substring(1));
    subseq(p, up.substring(1));
    subseq(p + (ch+0), up.substring(1));
  }
}


//print all subsets of the string by using array list using recursion

import java.util.ArrayList;

public class SubsequenceAL {
  public static void main(String[] args) {
    System.out.println(subseqAL("", "abc"));
  }
  static ArrayList<String> subseqAL(String p, String up){
    if (up.isEmpty()){
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    char ch = up.charAt(0);
    ArrayList<String> left = subseqAL(p+ch, up.substring(1));
    ArrayList<String> right = subseqAL(p, up.substring(1));

    left.addAll(right);
    return left;
  }
}

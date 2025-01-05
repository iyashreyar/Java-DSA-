
import java.util.ArrayList;


//print all the permutations of a given string in an arraylist using recursion 


public class PermutationsAL {
  public static void main(String[] args) {
    System.out.println(permutations("", "abc"));
  }
  static ArrayList<String> permutations(String p, String up){
    ArrayList<String> list = new ArrayList<>();
    if (up.isEmpty()){
      list.add(p);
      return list;
    }
    char ch = up.charAt(0);
    for (int i = 0; i <= p.length(); i++) {
      String f = p.substring(0,i);
      String s = p.substring(i,p.length());
      list.addAll(permutations(f+ch+s, up.substring(1)));
    }
    return list;
  }
}

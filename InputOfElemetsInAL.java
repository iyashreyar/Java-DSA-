import java.util.Scanner;
import java.util.ArrayList;

public class InputOfElemetsInAL {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(in.nextInt());
    }
    for (int i = 0; i < 10; i++) {
      list.get(i);
    }
    System.out.println(list);
  }
}

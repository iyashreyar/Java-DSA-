import java.util.ArrayList;
import java.util.Scanner;

public class inputInArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // INPUT
    for (int i = 0; i < 9; i++) {
      list.add(sc.nextInt());
    }

    // OUTPUT
    for (int i = 0; i < 9; i++) {
      System.out.println(list.get(i));
    }
  }
}

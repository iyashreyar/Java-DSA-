import java.util.ArrayList;
import java.util.Scanner;

public class multiAL {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // INITIALISATION
    for (int i = 0; i < 4; i++) {
      list.add(new ArrayList<>());
    }

    // ADDING ELEMENTS
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        list.get(i).add(sc.nextInt());
      }
    } 
    System.out.println(list);
  }
}

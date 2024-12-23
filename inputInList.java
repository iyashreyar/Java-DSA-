
//input in list by the user and showing the output

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class inputInList {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(in.nextInt());
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(list.get(i));
    }
    System.out.println(list);
  }
}

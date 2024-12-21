import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    int num1 = 0;
    int num2 = 1;
    int num3;
    Scanner sc = new Scanner(System.in);
    System.out.println("Total count of fibonacci series to be printed : ");
    int count = sc.nextInt();
    System.out.print(num1 + " " + num2);
    for (int i = 2; i < count; i++) {
      num3 = num1 + num2;
      System.out.print(" " + num3);
      num1 = num2;
      num2 = num3;
    }
  }
}

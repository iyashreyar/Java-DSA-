
//recursion : function calling itself
//recursion example

public class RecursionEg {
  public static void main(String[] args) {
    print(0);
  }

  static void print(int n) {
    if (n == 5) {
      System.out.println(5);
      return;
    }
    System.out.println(n);
    // this is called tail recursion
    // this is the last function call
    print(n + 1);
  }
}

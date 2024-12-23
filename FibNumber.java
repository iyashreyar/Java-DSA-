
//find the n'th fibonacci number
//fibonacci numbers : 0,1,1,2,3,5,8,13,21,34,55,89,144...

public class FibNumber {
  public static void main(String[] args) {
    int ans = fibonacci(12);
    System.out.println(ans);
  }

  static int fibonacci(int n) {
    if (n < 2) {
      return n;
    }
    // this is not tail recursion
    // because addition will take place atlast
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}

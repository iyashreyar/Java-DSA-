
//sum of all digits of a number using recursion

public class SumOfAllDigits {
  public static void main(String[] args) {
    int ans = DigitsSum(99);
    System.out.println(ans);
  }

  static int DigitsSum(int n) {
    if (n == 0) {
      return 0;
    }
    return (n % 10) + DigitsSum(n / 10);
  }
}

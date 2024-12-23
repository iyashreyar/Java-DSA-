public class DigitsProduct {
  public static void main(String[] args) {
    int ans = DigitsProduct(12345);
    System.out.println(ans);
  }

  static int DigitsProduct(int n) {
    if (n % 10 == n) { // if one digit is remaining return that single digit
      return n;
    }
    return (n % 10) * DigitsProduct(n / 10);
  }
}

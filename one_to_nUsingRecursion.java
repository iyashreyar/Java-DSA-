//return numbers from 1 to n using recursion

public class one_to_nUsingRecursion {
  public static void main(String[] args) {
    funBoth(5);
  }

  static void funBoth(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    funBoth(n - 1);
    System.out.println(n);
  }
}
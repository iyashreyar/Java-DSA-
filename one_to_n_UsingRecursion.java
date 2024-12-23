
//return numbers from 1 to n using recursion

public class one_to_n_UsingRecursion {
  public static void main(String[] args) {
    funRev(5);
  }

  static void funRev(int n) {
    if (n == 0) {
      return;
    }
    funRev(n - 1);
    System.out.println(n);
  }
}

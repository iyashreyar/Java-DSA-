
//to check whether if a number is palindrome or not 
// palindrome number eg = 12321

public class PalindromeOrNoT {
  public static void main(String[] args) {
    System.out.println(palindrome(1234321));
  }

  static int reverse(int n) {
    int digits = (int) (Math.log10(n)) + 1;
    return helper(n, digits);
  }

  static int helper(int n, int digits) {
    if (n % 10 == n) {
      return n;
    }
    int rem = n % 10;
    return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
  }

  static boolean palindrome(int n) {
    return n == reverse(n);
  }
}

//simpler method without recursion

/*
  static boolean isPalindrome(int x) {
        
        int num = x;
        int reverse = 0;

        while(num > 0)
        {
            reverse = (reverse * 10) + num%10;
            num = num/10;
        }

        return reverse == x;
    }
 */
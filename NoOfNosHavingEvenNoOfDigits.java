
//find total number of numbers that are having even number of digits

public class NoOfNosHavingEvenNoOfDigits {
  public static void main(String[] args) {
    int[] arr = { 12, 3455, 2, 6, 7896 };
    System.out.println(totalNo(arr));
  }

  static int Digits(int nums) {
    int count = 0;
    while (nums > 0) {
      count++;
      nums /= 10;
    }
    return count;
  }

  static boolean even(int nums) {
    int digits = Digits(nums);
    if (digits % 2 == 0) {
      return true;
    }
    return false;
  }

  static int totalNo(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }
}

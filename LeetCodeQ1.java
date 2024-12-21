
//find no of no with even no of digits

public class LeetCodeQ1 {
  public static void main(String[] args) {
    int[] nums = { 12, 234, 65, 3464, 74 };
    System.out.println(findNums(nums));
  }

  static int findNums(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (evenNo(num)) {
        count++;
      }
    }
    return count;
  }

  static boolean evenNo(int num) {
    int digits = noOfDigits(num);
    return digits % 2 == 0;
  }

  static int noOfDigits(int num) {
    // if array contains negative number, convert them into positive
    if (num < 0) {
      num = num * -1;
    }

    // if array contains 0
    if (num == 0) {
      return 1;
    }
    int count = 0;
    while (num > 0) {
      count++;
      num /= 10;
    }
    return count;
  }
}

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class LeetCodeQ3 {
  public static void main(String[] args) {
    char[] letters = { 'c', 'f', 'j' };
    char target = 'd';
    System.out.println("Element found : " + search(letters, target));
  }

  static char search(char[] letters, char target) {
    int start = 0;
    int end = letters.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target > letters[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return letters[start % letters.length];
  }
}

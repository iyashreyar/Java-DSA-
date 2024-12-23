
//return ceiling character
//return the smallest number greater than target
// note that letters wrap around ; => arr = { 'b', 'g', 'n', 'y' }, target = 'y' or 'z', output = 'b'

public class CeilingChar {
  public static void main(String[] args) {
    char[] letters = { 'a', 'g', 'n', 'y' };
    char target = 'g';
    System.out.println(CeilingQues(letters, target));
  }

  static char CeilingQues(char[] letters, char target) {
    int start = 0;
    int end = letters.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < letters[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return letters[start % letters.length];
  }
}

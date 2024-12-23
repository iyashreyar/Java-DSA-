import java.util.Arrays;
import java.util.Scanner;

public class advoutput {
  public static void main(String[] args) {

    try (Scanner in = new Scanner(System.in)) {
      int[][] arr = new int[3][3];

      // INPUT
      for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
          arr[row][col] = in.nextInt();
        }
      }

      // OUTPUT
      for (int row = 0; row < arr.length; row++) {
        System.out.println(Arrays.toString(arr[row]) + " ");
      }
    }
  }
}

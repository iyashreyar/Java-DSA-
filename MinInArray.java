
//find the  minimum value in the array

public class MinInArray {
  public static void main(String[] args) {
    int[] arr = { 18, 12, 7, 3, 14, 28 };
    int ans = min(arr);
    System.out.println(ans);
  }

  static int min(int[] arr) {
    int minVal = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < minVal) {
        minVal = arr[i];
      }
    }
    return minVal;
  }
}

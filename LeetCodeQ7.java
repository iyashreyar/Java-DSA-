
//https://leetcode.com/problems/missing-number/description/
//AMAZON QUES

class LeetCodeQ7 {

  public static void main(String[] args) {
    int[] arr = { 2, 5, 4, 1, 0 };
    System.out.println(missingNumber(arr));
  }

  static int missingNumber(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correctindex = arr[i];
      if (arr[i] < arr.length && arr[i] != arr[correctindex]) {
        swap(arr, i, correctindex);
      } else {
        i++;
      }
    }

    // case1: Search for the first missing number
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] != index) {
        return index;
      }
    }

    // case2
    return arr.length;
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}

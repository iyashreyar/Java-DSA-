
//find an element in the array using recursion

public class SearchInRecursion {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 3, 7, 54, 23, 98, 33 };
    int target = 33;
    System.out.println(search(arr, target, 0));
  }

  static int search(int[] arr, int target, int index) {
    if (index == arr.length) {
      return -1;
    }
    if (arr[index] == target) {
      return index;
    } else {
      return search(arr, target, index + 1);
    }
  }
}

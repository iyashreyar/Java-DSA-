
//find all the occurence of target element in an array by using recusion

import java.util.ArrayList;

public class AllOccurenceUsingRecursion {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 4, 5, 6, 7, 7, 8 };
    search(arr, 7, 0);
    System.out.println(list);
  }

  static ArrayList<Integer> list = new ArrayList<>();

  static void search(int[] arr, int target, int index) {
    if (index == arr.length) {
      return;
    }
    if (arr[index] == target) {
      list.add(index);
    }
    search(arr, target, index + 1);
  }
}


//return arraylist for all the occurence of target element in the array using recursion by using arraylist as argument

import java.util.ArrayList;

public class ArrayListForAllOccurenceUsingRecursion {
  public static void main(String[] args) {
    int[] arr = { 1, 5, 6, 3, 3, 7, 9, 9 };
    System.out.println(ans(arr, 3, 0, new ArrayList<>()));
  }

  static ArrayList<Integer> ans(int[] arr, int target, int index, ArrayList<Integer> list) {
    if (index == arr.length) {
      return list;
    }
    if (arr[index] == target) {
      list.add(index);
    }
    return ans(arr, target, index + 1, list);
  }
}

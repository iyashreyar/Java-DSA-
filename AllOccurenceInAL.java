
//return arraylist for all the occurence of target element in the array using recursion by using arraylist in the body

import java.util.ArrayList;

public class AllOccurenceInAL {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 4, 6 };
    System.out.println(search(arr, 4, 0));
  }

  static ArrayList<Integer> search(int[] arr, int target, int index) {
    ArrayList<Integer> list = new ArrayList<>();
    if (index == arr.length) {
      return list;
    }
    if (arr[index] == target) {
      list.add(index);
    }
    ArrayList<Integer> ansFromBelowCalls = search(arr, target, index + 1);
    list.addAll(ansFromBelowCalls);
    return list;
  }
}

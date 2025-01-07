
//ques - https://neetcode.io/problems/three-integer-sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NeetCodeQ3 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    static List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> outer = new HashSet();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                for (int k = j+1; k < arr.length; k++){
                    if (arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> inner = Arrays.asList(arr[i], arr[j], arr[k]);
                        outer.add(inner);
                    }
                }
            }
        }
        return new ArrayList<>(outer);
    }
}

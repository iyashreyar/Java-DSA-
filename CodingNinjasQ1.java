
//ques - https://www.naukri.com/code360/problems/rotate-array_1230543?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTabValue=PROBLEM

import java.util.ArrayList;
import java.util.List;

public class CodingNinjasQ1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(2, 4, 5, 7, 8));
        System.out.println(rotateArray(arr, 3));
    }
    static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        if(arr == null || k <= 0){
            return arr;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = k; i < arr.size(); i++){
            temp.add(arr.get(i));
        }
        for (int i = 0; i < k; i++) {
            temp.add(arr.get(i));
        }
        return temp;
    }
}

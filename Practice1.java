
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {27,5,9,8};
        Sort(arr);
    }
    static void Sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

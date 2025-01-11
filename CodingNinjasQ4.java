
//ques - https://www.naukri.com/code360/problems/equilibrium-index_893014?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTabValue=PROBLEM

public class CodingNinjasQ4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(arrayEquilibriumIndex(arr));
    }
    static int arrayEquilibriumIndex(int[] arr){  
        int totalSum = 0;
        int leftSum = 0;

        for (int num : arr){
            totalSum += num;
        }

        for (int i = 0; i < arr.length; i++) {
            if (leftSum == totalSum - leftSum - arr[i]){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
	}
}

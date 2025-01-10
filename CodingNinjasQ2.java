public class CodingNinjasQ2 {
    public static void main(String[] args) {
        int[] arr = {7,3,4,6,7,2,8,9,3,2,7,8,8,1,2};
        System.out.println(findSecondLargest(arr));
    }
    public static int findSecondLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE; 

		for (int num : arr){
			if (num > largest){
				secondLargest = largest;
				largest = num;
			}
			if (num > secondLargest && num != largest){
				secondLargest = num;
			}
		}
		if (secondLargest == Integer.MIN_VALUE){
			return -1;
		}
		return secondLargest;
	}
}

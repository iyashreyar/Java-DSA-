public class CodingNinjasQ3{
    public static void main(String[] args) {
        int[] arr = {8,4,2};
        System.out.println(canBeNonDecreasing(arr));
    }
    public static boolean canBeNonDecreasing(int[] arr) {
        int n = arr.length;
        int violations = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                violations++;
                if (violations > 1) {
                    return false; // More than one modification needed
                }

                // Attempt to fix the violation
                if (i > 0 && arr[i - 1] > arr[i + 1]) {
                    arr[i + 1] = arr[i]; // Modify arr[i + 1]
                } else {
                    arr[i] = arr[i + 1]; // Modify arr[i]
                }
            }
        }

        return true;
    }
}
public class LeetCodeQ27 {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] < buy){
                buy = prices[i];
            } else if (prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}

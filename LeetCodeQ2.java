public class LeetCodeQ2 {
  public static void main(String[] args) {
    int[][] accounts = {
        { 1, 2, 3 },
        { 3, 6, 5 }
    };
    System.out.println(maxWealth(accounts));
  }

  static int maxWealth(int[][] accounts) {
    int ans = Integer.MIN_VALUE;
    for (int person = 0; person < accounts.length; person++) {
      int rowsum = 0;
      for (int account = 0; account < accounts[person].length; account++) {
        rowsum += accounts[person][account];
      }
      if (rowsum > ans) {
        ans = rowsum;
      }
    }
    return ans;
  }
}

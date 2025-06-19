public class buyAndSellStock5 {
    public static void main(String args[]){

    }
}
/*class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        // If k >= n/2, we can do unlimited transactions
        if (k >= n / 2) {
            int maxProfit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }
            return maxProfit;
        }

        // dp[t][i] = max profit using at most t transactions up to day i
        int[][] dp = new int[k + 1][n];

        for (int t = 1; t <= k; t++) {
            // maxDiff is max(dp[t-1][j] - prices[j]) for j in [0..i-1]
            int maxDiff = -prices[0];

            for (int i = 1; i < n; i++) {
                // Either don't trade on day i or sell at day i (prices[i] + maxDiff)
                dp[t][i] = Math.max(dp[t][i - 1], prices[i] + maxDiff);

                // Update maxDiff for next iteration:
                // max of previous maxDiff or profit after last transaction minus current price
                maxDiff = Math.max(maxDiff, dp[t - 1][i - 1] - prices[i]);
            }
        }

        return dp[k][n - 1];
    }

    // Test with your input and print dp array
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {12, 16, 19, 19, 8, 1, 19, 13, 9};
        int k = 3;

        int maxProfit = sol.maxProfit(k, prices);
        System.out.println("Max profit with " + k + " transactions: " + maxProfit);
    }
}
*/ 

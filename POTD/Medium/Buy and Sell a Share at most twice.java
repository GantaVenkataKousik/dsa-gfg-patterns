

class Solution {
    public static int maxProfit(int n, int[] prices) {
        int sell = 0 , profit =0 , buy = Integer.MAX_VALUE;
        int[] dp = new int[n];
        
        for(int i=0 ; i<n ; i++){
            if(prices[i] < buy){
                buy = sell = prices[i];
            }
            if(prices[i] > sell){
                sell  = prices[i];
            }
            profit = Math.max(sell-buy,profit);
            dp[i] = profit;
        }

        int i = n-1;
        for(i=n-1 , sell=0 , buy = Integer.MAX_VALUE , profit =0 ; i>=1 ; i--){
            if(prices[i]<buy){
                buy = prices[i];
            }
            if(prices[i] > sell){
                sell = buy = prices[i];
            }
            profit = Math.max(profit,dp[i] + sell-buy);
        }
        return profit;
    }
}

class Solution {
    

    public int kPalindrome(String str, int n, int k) {
        int dp[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if(str.charAt(i-1) == str.charAt(n - j))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j-1]);
            }
        }
        return n - dp[n][n] <= k ? 1 : 0;
    }
}

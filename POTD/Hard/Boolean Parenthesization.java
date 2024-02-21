
class Solution{
    static int countWays(int n, String s){
        int mod = 1003;
        int[][][] dp = new int[n][n][2];
        for (int i = 0; i < n; i += 2) {
            if (s.charAt(i) == 'T')dp[i][i][1] = 1;
            else dp[i][i][0] = 1;
        }

        for (int cut = 2; cut < n; cut += 2) {
            for (int i = 0; i < n - cut; i += 2) {
                int j = i + cut;
                for (int k = i + 1; k < j; k += 2) {
                    
                    int leftTrue = dp[i][k-1][1],leftFalse = dp[i][k-1][0],rightTrue = dp[k+1][j][1],rightFalse = dp[k+1][j][0];
                    
                    if (s.charAt(k) == '&') {
                        dp[i][j][1] = (dp[i][j][1] + (leftTrue * rightTrue) % mod) % mod;
                        dp[i][j][0] = (dp[i][j][0] + ((leftFalse * rightFalse) % mod+ (leftFalse * rightTrue) % mod+ (leftTrue * rightFalse) % mod) % mod) % mod;
                    } else if (s.charAt(k) == '|') {
                        dp[i][j][0] = (dp[i][j][0] + (leftFalse * rightFalse) % mod) % mod;
                        dp[i][j][1] = (dp[i][j][1] + ((leftTrue * rightTrue) % mod+ (leftFalse * rightTrue) % mod+ (leftTrue * rightFalse) % mod) % mod) % mod;
                    } else if (s.charAt(k) == '^') {
                        dp[i][j][1] = (dp[i][j][1] + ((leftTrue * rightFalse) % mod + (leftFalse * rightTrue) % mod) % mod) % mod;
                        dp[i][j][0] = (dp[i][j][0] + ((leftTrue * rightTrue) % mod+ (leftFalse * rightFalse) % mod) % mod) % mod;
                    }
                }
            }
        }

        return dp[0][n - 1][1];
    }
}

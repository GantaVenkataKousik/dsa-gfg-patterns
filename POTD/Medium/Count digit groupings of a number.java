
class Solution
{
    public int TotalCount(String str)
    {
               int sumOfDigit = 0;
        for (char digit : str.toCharArray()) {
            sumOfDigit += (digit - '0');
        }

        int[][] dp = new int[str.length() + 1][sumOfDigit + 1];

        for (int i = str.length() - 1; i >= 0; i--) {
            for (int pre = 0; pre <= sumOfDigit; pre++) {
                int sum = 0;
                int ans = 0;
                for (int j = i; j < str.length(); j++) {
                    sum += (str.charAt(j) - '0');
                    if (sum >= pre) {
                        if (j + 1 >= str.length()) {
                            ans++;
                        } else {
                            ans += dp[j + 1][sum];
                        }
                    }
                }
                dp[i][pre] = ans;
            }
        }

        return dp[0][0];
    }
}

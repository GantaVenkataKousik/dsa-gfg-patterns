
class Solution
{
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
              //Base case
        if(s.length() == 0)return 0;
        
        int N = s.length();
        boolean[] dp = new boolean[N+1];
        dp[0] = true;
        
        for(int i=0; i<=N; i++){
            for(int j=0; j<=i; j++){
                if(dp[j]&&dictionary.contains(s.substring(j,i))){
                    dp[i]=true;
                }
            }
        }

        return dp[N]?1:0;
    }

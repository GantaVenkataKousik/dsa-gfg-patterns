class Solution
{
    
    static int mod = 1000000007;
    
    private static int solve(String s,String t,int i,int j,int[][] dp){
        if(i==s.length()){
            if(j==t.length())return 1;
            return 0;
        
        }
        if(j==t.length())return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        
        int take=0 , nottake= 0;
        if(s.charAt(i) == t.charAt(j)){
            take = take + solve(s,t,i+1,j+1,dp)%mod + solve(s,t,i+1,j,dp)%mod;
        }
        else nottake = 0+solve(s,t,i+1,j,dp)%mod;
        return dp[i][j] = Math.max(take,nottake)%mod;
    }
    
    int  subsequenceCount(String s, String t)
    {
        
        int[][] dp = new int[s.length()][t.length()];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return solve(s,t,0,0,dp);
    }
}

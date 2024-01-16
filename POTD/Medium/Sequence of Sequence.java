class Solution{
    
    static  int func(int m, int n, int i, int j,int[][] dp){
        if(i==n) return 1;
        if(j>m) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int take = 0, notTake = 0; 
        
        take = func(m, n, i+1, 2*j, dp);
        notTake = func(m, n, i, j+1  ,dp);
        
        return dp[i][j] = take+notTake;
    }
    
    static int numberSequence(int m, int n)
    {
       int[][] dp = new int[n][m + 1];
       for(int i=0 ; i<n ; i++){
           for(int j=0 ; j<=m  ;j++ ){
               dp[i][j] = -1;
           }
       }
        return func(m, n, 0, 1,dp);

    }
}

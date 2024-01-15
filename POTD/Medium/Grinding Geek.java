class Solution {
    
    int dp[][];
    
    private int Helper(int n,int total,int[] cost,int index){
        if(index == n)return 0;
        if(total <= 0)return 0;
        if(dp[index][total]  != -1)return dp[index][total];
        
        int take = 0;
        if(total >= cost[index]){
             int newTotal = (int)Math.floor(total - cost[index]*0.10);
            take = 1+Helper(n,newTotal,cost , index+1);
        }
        int notTake = Helper(n,total,cost,index+1);
        
        return dp[index][total] = Math.max(take,notTake);
    }
    
    public int max_courses(int n, int total, int[] cost) {
        dp = new int[n+1][total+1];
        for(int i=0 ; i<=n ; i++){
            for(int j = 0 ; j<=total ; j++){
                dp[i][j] = -1;
            }
        }
        return Helper(n,total,cost,0);
    }
}

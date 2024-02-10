class Solution {
    
    private long solve(int[][] arr,int k,long sum,int r,int c){
        
        if(r<0 || c<0)return 0;
        sum += arr[r][c];
        if(sum>k)return 0;
        if(r==0 && c==0){
            if(sum==k)return 1;
            return 0;
        }   
        long up = solve(arr,k,sum,r-1,c);
        long right = solve(arr,k,sum,r,c-1);
        return up+right;
    }
    
    long numberOfPath(int n, int k, int [][]arr) {
        return solve(arr,k,(long)0,n-1,n-1);
    }
}

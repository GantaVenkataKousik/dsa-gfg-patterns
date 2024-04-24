class Solution {
    
    public int findSum(int mat[][],int n,int m,int i,int j){
        int sum = 0;
        for(int k = 0 ; k<3 ; k++){
            sum+=mat[i][j+k];
            sum+=mat[i+2][j+k];
        }
        sum+=mat[i+1][j+1];
        return sum;
    }
    
    int findMaxSum(int n, int m, int mat[][]) {
        int maxSum = 0 ;
        for(int i=0 ; i<n-2 ; i++){
            for(int j=0 ; j<m-2 ; j++){
                maxSum = Math.max(findSum(mat,n,m,i,j),maxSum);
            }
        }
        return maxSum==0?-1:maxSum;
    }
};

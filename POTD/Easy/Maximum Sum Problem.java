
class Solution
{
   public int solve(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        
        int a=solve(n/2);
        int b=solve(n/3);
        int c=solve(n/4);
        
        return Math.max(n,(a+b+c));
    }
    
    public int maxSum(int n) 
    {
        return solve(n);
    } 
}

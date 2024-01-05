class Solution
{
    static int mod = (int)1e9+7;
    
    private static long Helper(int n){
        long a = 1;
        long b = 1;
        long temp = 0;
        for(int i=1 ; i<n ; i++){
            temp = (a%mod + b%mod)%mod;
            a = b%mod;
            b = temp%mod;
        }
        return (b%mod + a%mod)%mod;
    }
    
    public int TotalWays(int N)
    {
        long ans = Helper(N);
        return (int)((ans*ans)%mod);
    }
}

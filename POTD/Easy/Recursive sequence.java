
class Solution{

    static long sequence(int n){
        int mod = (int)(1000000007);
        long pointer = 2,res = 1;
        long sum = 1;
        for(int i=2 ; i<=n ; i++){
            long pro = 1;
            for(int j=1 ; j<=i ; j++){
                pro = ((pro%mod)*(pointer%mod))%mod;
                pointer++;
            }
            sum = ((sum%mod)+(pro%mod))%mod;
        }
        return sum;
    }
}

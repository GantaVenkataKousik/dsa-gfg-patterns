
class Solution {
    long sumBitDifferences(int[] arr, int n) {
        long ans = 0;
        for(int i=31;i>=0;i--){
            long count = 0;
            for(int j=0;j<n;j++){
                if((arr[j] & (1<<i))!=0)
                count++;
            }
            ans += 2*count*(n-count);
        }
        return ans;
    }
}

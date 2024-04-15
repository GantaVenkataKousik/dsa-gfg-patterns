
class Solution {
    public static int minimizeDifference(int n, int k, int[] arr) {
        int[] maxSuffix = new int[n + 1];
        int[] minSuffix = new int[n + 1];

        maxSuffix[n] = Integer.MIN_VALUE;
        minSuffix[n] = Integer.MAX_VALUE;
        
        maxSuffix[n - 1] = arr[n - 1];
        minSuffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxSuffix[i] = Math.max(maxSuffix[i + 1], arr[i]);
            minSuffix[i] = Math.min(minSuffix[i + 1], arr[i]);
        }
        
        int maxPrefix = arr[0];
        int minPrefix = arr[0];
        
        int minDiff = maxSuffix[k] - minSuffix[k];
        
        for (int i = 1; i < n; i++) {
            if (i + k <= n) {
                int maxi = Math.max(maxSuffix[i + k], maxPrefix);
                int mini = Math.min(minSuffix[i + k], minPrefix);
       
                minDiff = Math.min(minDiff, maxi - mini);
                
                maxPrefix = Math.max(maxPrefix, arr[i]);
                minPrefix = Math.min(minPrefix, arr[i]);
            }
            else return minDiff;
        }
        return minDiff;
    }
}
        

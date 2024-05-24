class Solution {
    long max_Books(int arr[], int n, int k) {
        long ans = 0;
        long sum = 0;
        long max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(arr[i]<=k){
                sum += arr[i];
                continue;
            }
            else{
                    max = Math.max(max,sum);
                    sum=0;
            }
        }
        max = Math.max(max,sum);
        return (max==Integer.MIN_VALUE)?0:max;
    }
}

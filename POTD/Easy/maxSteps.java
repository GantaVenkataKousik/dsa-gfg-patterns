class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int cnt = 0;
        for(int i=1 ; i<n ; i++){
            if(arr[i]>arr[i-1])cnt++;
            else{
                max = Math.max(max,cnt);
                cnt = 0;
            }
        }
        max=Math.max(cnt,max);
        return max;
    }
}

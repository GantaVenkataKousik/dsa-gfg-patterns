class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int diff = arr[n-1]-arr[0] , max = -1 , min = -1;
        for(int i=1 ; i<n ; i++){
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            if(arr[i]-k < 0)continue;
            min = Math.min(arr[i]-k,arr[0]+k);
            diff = Math.min(diff,max-min);
        }
        return diff;
    }
}

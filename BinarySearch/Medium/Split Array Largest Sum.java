
class Solution {
    
    static int noOfPairs(int[] arr,int target){
        int par = 0 , n = arr.length , sum = 0;
        for(int i=0 ; i<n ; i++){
            if(sum + arr[i] <= target)sum += arr[i];
            else{
                par++;
                sum = arr[i];
            }
        }
        return par+1;
    }
    
    static int splitArray(int[] arr , int N, int K) {

        int min = arr[0] , sum = 0;
        
        for(int ele : arr){
            min = Math.max(ele,min);
            sum += ele;
        }
        
        int low = min , high = sum , mid = -1;
        while(low<=high){
            mid = low + (high-low)/2;
            
            int par = noOfPairs(arr,mid);
            
            if(par > K)low = mid + 1;
            else high = mid-1;
        }
        
        return low;
    }
};

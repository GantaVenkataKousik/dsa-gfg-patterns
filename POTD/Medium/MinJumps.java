class Solution {
    static int minJumps(int[] arr){
        int maxRange = 0 , curr = 0 , noOfJumps = 0 , n= arr.length ; 
        for(int i=0 ; i<n ; i++){
            maxRange = Math.max(maxRange,i+arr[i]);
            if(i == curr){
                if(curr== maxRange)return -1;
                curr = maxRange;
                noOfJumps++;
                if(curr >= n-1){
                    return noOfJumps;
                }
            }
        }
        return noOfJumps;
    }
}

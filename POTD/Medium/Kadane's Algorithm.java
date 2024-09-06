class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        
        int sum = 0;
        boolean allNeg = true;
        for(int ele : arr){
            sum += ele;
            if(sum < 0)sum =0;
            if(sum > maxSum)maxSum  = sum;
            if(ele <0){
                min = Math.max(min,ele);
            }
            if(ele >=0 && allNeg)allNeg = !allNeg;
        }
        
        if(allNeg)return min;
        return maxSum;
    }
}

// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        int sum = 0;
        for(int ele : arr)sum+=ele;
        int totalSum = ((n*(n+1))/2);
        
        return totalSum-sum;
    }
}

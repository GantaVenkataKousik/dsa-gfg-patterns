
//User function Template for Java


class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        for(int i=1 ; i<n ; i++){
            if(arr[(i-1)/2] < arr[i])return false;
        }
        return true;
    }
}

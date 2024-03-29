import java.util.* ;
import java.io.*; 


public class Solution {

    static int minDiff(int n, int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<n-1 ; i++){
            if(arr[i+1]-arr[i] < minDiff){
                minDiff = arr[i+1] - arr[i];
            }
        }
        return minDiff;

    }
}

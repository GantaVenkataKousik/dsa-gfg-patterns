class Solution {  
    
    private static int cnt = 0;
    
    static void mergeAndCount(int arr[], int low, int mid, int high) {
        int swapCount = 0;
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int temp1[] = new int[n1], temp2[] = new int[n2];
        for(int m=0;m<n1;++m) {
            temp1[m] = arr[low + m];
        }
        for(int m=0;m<n2;++m) {
            temp2[m] = arr[mid + 1 + m];
        }
        int i = 0, j = 0, k = low;
        while(i < n1 && j < n2) {
            if(temp1[i] <= temp2[j]) {
                arr[k] = temp1[i];
                ++i;
            }
            else {
                cnt += (n1 - i);
                arr[k] = temp2[j];
                ++j;
            }
            ++k;
        }
        while(i < n1) {
            arr[k] = temp1[i];
            ++i;
            ++k;
        }
        while(j < n2) {
            arr[k] = temp2[j];
            ++j;
            ++k;
        }
    }
    static void mergeSortAndCount(int arr[], int low, int high) {

        if(low < high) {
            int mid = low + (high - low) / 2;
            mergeSortAndCount(arr, low, mid);
            mergeSortAndCount(arr, mid + 1, high);
            mergeAndCount(arr, low, mid, high);
        }
        return ;
    }
    static int countPairs(int arr[], int n) 
    {   
         cnt = 0; 
         for(int i=0;i<n;++i) {
             arr[i] = i * arr[i];
         }
         mergeSortAndCount(arr, 0, n - 1);
         return cnt;
    }
}

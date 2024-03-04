class Solution
{
    public void swapElements(int[] arr, int n)
    {
        for(int i=0 ; i<n ; i+=2){
            int t1 = arr[i];

            if(i+2<n){
                arr[i] = arr[i+2];
                arr[i+2] = t1;
            }
            if(i+1<n && i+3 < n){
                int t2 = arr[i+1];
                arr[i+1] = arr[i+3];
                arr[i+3] = t2;
            }
        }
        return ;
    }
}

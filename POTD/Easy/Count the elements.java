class Solution
{
    private static int UpperBound(int b[] , int SearchElement  ){
        int index = -1 , low = 0 , high = b.length-1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(b[mid] <= SearchElement) {
                index = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if(index == -1) {
            return 0;
        }
        return index + 1;
    }
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        Arrays.sort(b);
        int[] ans = new int[q];
        for(int i=0 ; i<q ; i++){
            ans[i] = UpperBound(b,a[query[i]]);
        }
        return ans;
        
    }
}

class Solution
{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-(k-1);i++){
            for(int j=i;j<i+k;j++){
                max=Math.max(max,arr[j]);
            }
            
            list.add(max);
            max=Integer.MIN_VALUE;
        }
        return list;
    }
}

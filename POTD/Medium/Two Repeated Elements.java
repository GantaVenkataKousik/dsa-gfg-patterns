class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        List<Integer> l = new ArrayList<>();
        int[] ans = new int[2];
        for(int i=0 ; i<=n+1 ; i++){
            int index = Math.abs(arr[i]);
            if(arr[index]<0){
                l.add(index);
            }
            else{
                arr[index] *= -1;
            }
        }
        ans[0] = l.get(0);
        ans[1] = l.get(1);
        return ans;
    }
    
}

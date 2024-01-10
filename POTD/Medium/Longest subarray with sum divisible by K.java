class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max_Size=0;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=a[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                max_Size=Math.max(max_Size,i-map.get(rem));
            }else{
                map.put(rem,i);
            }
        }
        return max_Size;
       
    }
 
}

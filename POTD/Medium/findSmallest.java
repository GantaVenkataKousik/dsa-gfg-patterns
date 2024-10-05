class Solution {
    public long findSmallest(int[] arr) {
        int ans = 1;
        for(int ele : arr){
            if(ele > ans)return ans;
            ans += ele;
        }
        return ans;
    }
}

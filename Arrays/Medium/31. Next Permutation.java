class Solution {


    private void swap(int[] nums,int t1,int t2){
        int temp = nums[t1];
        nums[t1] = nums[t2];
        nums[t2] = temp;
    }

    public void nextPermutation(int[] nums) {
        int e = nums.length-1;
        while(e>0){
            if(nums[e]>nums[e-1]){
                swap(nums,e,e-1);
                return ;
            }
            e--;
        }
        Arrays.sort(nums);
    }
}

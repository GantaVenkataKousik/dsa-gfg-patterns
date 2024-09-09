class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(ArrayList<Integer> arr) {
        int low = 0 , mid = 0 , end = arr.size()-1;
        while(mid<=end){
            if(arr.get(mid) == 1)mid++;
            else if(arr.get(mid)==0){
                int num = arr.get(low);
                arr.set(low,0);
                arr.set(mid,num);
                low++;
                mid++;
            }
            else{
                int highNum = arr.get(end);
                arr.set(end,2);
                arr.set(mid,highNum);
                end--;
            }
        }
        return ;
    }
}

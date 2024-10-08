class Solution {
    public static int pairsum(int[] arr) {
        int first_max=arr[0],n=arr.length;
        if(n==2)return arr[0]+arr[1];
        int second_max=Integer.MIN_VALUE;
        int first_max_index=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]>first_max){
                first_max_index=i;
                first_max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>second_max && i!=first_max_index){
                second_max=arr[i];
            }
        }
        return first_max+second_max;
    }
}

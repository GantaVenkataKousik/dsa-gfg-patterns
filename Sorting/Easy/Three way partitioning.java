class Solution{
    public void swap(int array[] , int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public void threeWayPartition(int array[], int a, int b)
    {
        int start = 0  , end = array.length-1;
        int i=0 ; 
        
        while(i<=end){
            if(array[i]<a){
                swap(array,start,i);
                start++;
                i++;
            }
            else if(array[i]>b){
                swap(array,i,end);
                end--;
            }
            else i++;
        }
    }
}

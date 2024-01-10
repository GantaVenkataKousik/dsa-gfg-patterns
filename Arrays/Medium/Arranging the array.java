class Solution {
    

    public void Rearrange(int arr[], int n)
    {
        
        int j=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]<0){
                if(i==j)j++;
                else{
                    int temp = arr[i];
                    for(int k=i ; k>j ; k--){
                        arr[k]  =arr[k-1];
                    }
                    arr[j] = temp;
                    j++;
                }
            }
        }
        return ;
        
    }
}

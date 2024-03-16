
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> l = new ArrayList<>();
        int max = arr[n-1];
        l.add(max);
        for(int i=n-2 ; i>=0 ; i--){
            if(arr[i]>=max){
                l.add(arr[i]);
                max = arr[i];
            }
        }
        int i=0 , j = l.size()-1;
        while(i<j){
            int temp = l.get(i);
            l.set(i,l.get(j));
            l.set(j,temp);
            i++;
            j--;
        }
        return l;
    }
}

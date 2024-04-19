class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0 , j =0;
        Set<Integer> st = new HashSet<>();
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(st.contains(arr1[i]))i++;
                else{
                    st.add(arr1[i]);
                    ans.add(arr1[i]);
                    i++;
                }
            }
            else{
                if(st.contains(arr2[j]))j++;
                else{
                    st.add(arr2[j]);
                    ans.add(arr2[j]);
                    j++;
                }
            }
        }
        while(i<n){
                            if(st.contains(arr1[i]))i++;
                else{
                    st.add(arr1[i]);
                    ans.add(arr1[i]);
                    i++;
                }
        }
        while(j<m){
                            if(st.contains(arr2[j]))j++;
                else{
                    st.add(arr2[j]);
                    ans.add(arr2[j]);
                    j++;
                }
        }
        return ans;
    }
}

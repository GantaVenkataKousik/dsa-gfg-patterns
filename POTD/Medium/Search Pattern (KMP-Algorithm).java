class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
        int n = pat.length() , m = txt.length();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<=m-n ; i++){
            int j;
            for(j=0 ; j<n ; j++){
                if(txt.charAt(i+j)!=pat.charAt(j))break;
            }
            if(n == j){
                ans.add(i+1);
            }
        }
        return ans;
    }
}

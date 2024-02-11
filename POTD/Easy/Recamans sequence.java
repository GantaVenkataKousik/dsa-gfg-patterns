class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        ArrayList<Integer> ans  = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        st.add(0);
        ans.add(0);
        for(int i=1 ; i<n ; i++){
            int term = ans.get(i-1)-i;
            if(term<0 || st.contains(term)){
                term = ans.get(i-1)+i;
            }
            st.add(term);
            ans.add(term);
        }
        return ans;
    }
}

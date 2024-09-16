class Solution{
    static int maxLength(String S){
        Stack<Integer> st = new Stack<>();
        char ch;
        int maxLen = 0;
        st.push(-1);
        for(int i=0 ; i<S.length() ; i++){
            if(S.charAt(i)=='('){
                st.push(i);
            }
            else{
                
                st.pop();
                //is stack is empty no valid parenthesis is ther eat this momeny
                //so push the current index to start it as the starting point
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    maxLen = Math.max(maxLen,i-st.peek());
                }
            }
            
        }
        return maxLen;
    }
}

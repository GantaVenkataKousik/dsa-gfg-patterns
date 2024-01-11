
class Solution {
    public String removeKdigits(String S, int k) {
        Stack<Character> st = new Stack<>();
        int n = S.length();
        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && st.peek()>S.charAt(i) && k>0){
                st.pop();
                k--;
            }
            
            st.add(S.charAt(i));
        }
        
        while(!st.isEmpty() && k-- > 0){
            st.pop();
        }
        
        if(st.isEmpty())return "0";
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        
        int index = 0;
        while(index<sb.length() && sb.charAt(index) == '0')index++;
        
        return (index==sb.length())?"0":sb.toString().substring(index);
    }
}

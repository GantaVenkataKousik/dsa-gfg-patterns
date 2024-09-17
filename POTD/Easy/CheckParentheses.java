class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> st = new Stack();
        for(char ch : x.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='(')st.push(ch);
            else{
                if(st.isEmpty())return false;
                if((ch=='}' && st.peek()!='{') || (ch==']' && st.peek()!='[') ||
                (ch==')' && st.peek()!='('))return false;
                st.pop();
            }
        }
        return st.isEmpty();
        
    }
}

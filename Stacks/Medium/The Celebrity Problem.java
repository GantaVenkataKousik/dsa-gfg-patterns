
class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            st.push(i);
        }
        
        while(st.size() != 1){
            int personA = st.pop();
            int personB = st.pop();
            
            if(M[personA][personB] == 1){
                st.push(personB);
            }
            else{
                st.push(personA);
            }
        }
        
        int person = st.pop();
        
        for(int i=0 ; i< n ; i++){
            if(M[person][i] == 1)
                return person=-1;
            if(i!=person && M[i][person] == 0)return person=-1;
        }
        return person; 
    }
}

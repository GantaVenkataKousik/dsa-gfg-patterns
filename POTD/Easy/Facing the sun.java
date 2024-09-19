class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        Stack<Integer> st = new Stack<>();
        int cnt = 0;
        for(int h : height){
            if(st.isEmpty()){
                st.push(h);
                cnt++;
            }
            else{
                if(h<=st.peek())continue;
                else{
                    while(!st.isEmpty() && st.peek() < h)st.pop();
                    cnt++;
                    st.push(h);
                }
            }
        }
        return cnt;
    }
}

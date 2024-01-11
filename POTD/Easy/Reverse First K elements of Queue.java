class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Queue<Integer> ans = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        while(k-- > 0){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        while(!q.isEmpty()){
            ans.add(q.poll());
        }
        return ans;
    }
}

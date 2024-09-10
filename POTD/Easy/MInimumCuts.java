class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long ans = 0;
        for(long ele:arr){
           pq.add(ele);
        }
        while(pq.size()>=2){
               long first = pq.poll();
               long second = pq.poll();
               ans += (first+second);
               pq.add(first+second);
        }
        return ans;
    }
}

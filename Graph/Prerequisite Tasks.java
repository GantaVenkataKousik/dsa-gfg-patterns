
class Solution {
    public boolean isPossible(int N,int P, int[][] pre)
    {
               Queue<Integer> q = new LinkedList<>();
        int[] indegree = new int[N];
        ArrayList<Integer> topo = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0 ; i<N ; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0 ; i<P ; i++){
            adj.get(pre[i][1]).add(pre[i][0]);
        }
        
        for(int i=0 ; i<N ; i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        for(int i=0 ; i<N ; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        while(!q.isEmpty()){
            int node = q.poll();
            topo.add(node);
            
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
            
        }
        
        return topo.size() == N;
    }
    
}

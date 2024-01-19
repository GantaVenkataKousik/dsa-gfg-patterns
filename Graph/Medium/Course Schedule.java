
class Solution
{
    static int[] findOrder(int N, int P, ArrayList<ArrayList<Integer>> pre) 
    {
        Queue<Integer> q = new LinkedList<>();
        
        int[] indegree = new int[N];
        int[] ans = new int[N];
        int k = 0;
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0 ; i<N ; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0 ; i<P ; i++){
            adj.get(pre.get(i).get(1)).add(pre.get(i).get(0));
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
            ans[k++] = node;
            
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        
        if(k != N)return new int[0];
        
        return ans;
    }
}

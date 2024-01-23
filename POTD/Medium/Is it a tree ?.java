
//User function Template for Java
class Solution {
    
    private static void dfs(int s,ArrayList<Integer>[] adj,boolean[] vis){
        vis[s] = true;
        for(int v : adj[s]){
            if(!vis[v]){
                dfs(v,adj,vis);
            }
        }
    }
    
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        if((n-m)!=1)return false;
        
        boolean[] vis = new boolean[n];
        ArrayList<Integer>[] adj = new ArrayList[n];
        
        for(int i=0 ; i<n ; i++){
            adj[i] = new ArrayList<>();
        }
        
        for(ArrayList<Integer> edge : edges){
            adj[edge.get(0)].add(edge.get(1));
            adj[edge.get(1)].add(edge.get(0));
        }
        
        dfs(0,adj,vis);
        
        for(boolean val : vis){
            if(!val)return false;
        }
        return true;
    }
}


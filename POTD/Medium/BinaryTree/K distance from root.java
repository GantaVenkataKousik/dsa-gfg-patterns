class Tree
{
     // Recursive function to print right view of a binary tree.
     public void dfs(Node root ,ArrayList<Integer> ans ,  int dis , int  k){
         if(root == null)return ;
         
         if(dis == k){
             ans.add(root.data);
             return ;
         }
         
         dfs(root.left,ans,dis+1,k);
         dfs(root.right,ans,dis+1,k);
         
     }
     
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          ArrayList<Integer> ans = new ArrayList<>();
          dfs(root , ans , 0 , k);
          return ans;
     }
}

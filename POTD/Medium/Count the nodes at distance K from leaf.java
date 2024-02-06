
//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
    //Function to return count of nodes at a given distance from leaf nodes.
    
    public boolean check(Node root,int dis,int k){
        if(root==null)return false;
        if(dis==k){
            return (root.left==null && root.right==null);
        }
        
        return (check(root.left,dis+1,k) || check(root.right,dis+1,k));
    }
    
    public void count(Node root,int k,int[] ans){
        if(root == null)return ;
        if(check(root,0,k))ans[0]++;
        count(root.left,k,ans);
        count(root.right,k,ans);
    }
    
    int printKDistantfromLeaf(Node root, int k)
    {
        int[] ans = new int[1];
        count(root,k,ans);
        return ans[0];
    }

}

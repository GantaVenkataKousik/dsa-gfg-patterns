class GfG {
    
    
    Node LCA(Node root,int n1,int n2){
        if(root == null)return null;
        if(root.data == n1 || root.data==n2)return root;
        
        Node left = LCA(root.left,n1,n2);
        Node right = LCA(root.right,n1,n2);
        
        if(left == null)return right;
        if(right == null)return left;
        
        return root;
    }
    
    int calDist(Node node,int n){
        if(node==null)return -1;
        if(node.data == n)return 0;
        
        int left = calDist(node.left,n);
        int right = calDist(node.right,n);
        
        if(left == -1 && right == -1)return -1;
        
        if(left == -1)return right+1;
        return left+1;
    }
    
    int findDist(Node root, int a, int b) {
        Node lca = LCA(root,a,b);
        int dista = calDist(lca,a);
        int distb = calDist(lca,b);
        return dista + distb;
    }
}

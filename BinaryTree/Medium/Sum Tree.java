class Solution {
    
    private static boolean isTrue = true;
    
    private static int isSum(Node root){
        if(root==null)return 0;
        if(root.left==null && root.right==null)return root.data;
        int data = root.data;
        
        int left = isSum(root.left);
        int right = isSum(root.right);
        
        if(left+right!=data){
            isTrue = false;
        }
        return root.data+left+right;
    }
    
    boolean isSumTree(Node root) {
        isSum(root);
        boolean ans= isTrue;
        isTrue = true;
        
        return ans;
    }
}

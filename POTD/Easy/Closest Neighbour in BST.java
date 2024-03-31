class Solution {
    public static int findMaxForN(Node root, int n) {
        int ans = -1;
        while(root!=null){
            if(root.key == n)return n;
            if(root.key < n){
                ans = root.key;
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        return ans;
    }
}

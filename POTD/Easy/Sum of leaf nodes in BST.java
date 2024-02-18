class Solution
{
    private static void findSum(Node root,int[] ans){
        if(root==null)return ;
        if(root.left == null && root.right==null){
            ans[0]=ans[0]+root.data;
            return ;
        }
        findSum(root.left,ans);
        findSum(root.right,ans);
    }
    
    public static int sumOfLeafNodes(Node root)
    {
        int[] ans = new int[1];
        findSum(root,ans);
        return ans[0];
        
    }
}

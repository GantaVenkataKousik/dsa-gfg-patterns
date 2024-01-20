

class Solution
{
    static int step;
    public static int distributeCandy(Node root)
    {
        step=0;
        findMove(root);
        return step;
    }
    static int findMove(Node curnode)
    {
        if(curnode == null) return 0;
        
        int l = findMove(curnode.left);
        int r = findMove(curnode.right);
        step += Math.abs(l)+Math.abs(r);

        return (l+r+curnode.data-1);
    }
}

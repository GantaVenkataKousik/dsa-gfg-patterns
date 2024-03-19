

class Solution
{
    static void inorder(Node root,ArrayList<Integer> l){
        if(root!=null){
            inorder(root.left,l);
            l.add(root.data);
            inorder(root.right,l);
        }
            
        }
    boolean isBST(Node root)
    {
        // code here.
        ArrayList<Integer> l = new ArrayList<Integer>();
        inorder(root,l);
        for(int i= 1 ; i<l.size() ; i++){
            if(l.get(i)<l.get(i-1))return false;
        }
        return true;
    }
}

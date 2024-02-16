class Solution {
    
    private static void inOrder(Node root,List<Integer> list){
        if(root!=null){
            inOrder(root.left,list);
            list.add(root.data);
            inOrder(root.right,list);
        }
    }
    
    public Node flattenBST(Node root) {
        List<Integer> ans = new ArrayList<>();
        inOrder(root,ans);
        Node r = new Node(ans.get(0));
        Node temp = r;
        for(int i=1 ; i<ans.size() ; i++){
            temp.right = new Node(ans.get(i));
            temp = temp.right;
        }
        return r;
        
    }
}

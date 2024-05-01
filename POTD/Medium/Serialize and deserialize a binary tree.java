
class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public void ser(ArrayList<Integer> arr , Node root){
        if(root==null){
            arr.add(-1);
            return ;
        }
        arr.add(root.data);
        ser(arr,root.left);
        ser(arr,root.right);
    }
    
    public ArrayList<Integer> serialize(Node root) {
       ArrayList<Integer> arr = new ArrayList<>();
       ser(arr,root);
       return arr;
    }


    int index = -1;
    public Node deSerialize(ArrayList<Integer> A) {
        index = -1;
        return des(A);
    }
    public Node des(ArrayList<Integer> a){
        index++;
        if(a.get(index)==-1)return null;
        Node node = new Node(a.get(index));
        
        node.left = des(a);
        node.right = des(a);
        
        return node;
    }

};

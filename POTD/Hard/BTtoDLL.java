
class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here
	    ArrayList<Integer> list = inOrderTraversal(root);
	    Node head = new Node(list.get(0));
	    Node tail = head;
	    for(int i=1 ; i<list.size() ; i++){
	        tail.right  = new Node(list.get(i));
	        tail.right.left = tail;
	        tail = tail.right;
	    }
	    return head;
    }
    static ArrayList<Integer> inOrderTraversal(Node root){
        if(root==null){
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(inOrderTraversal(root.left));
        list.add(root.data);
        list.addAll(inOrderTraversal(root.right));
        
        return list;
        
    }
}

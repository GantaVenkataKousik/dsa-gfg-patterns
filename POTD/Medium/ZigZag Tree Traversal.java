
class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{

	    
	    Queue<Node> q = new LinkedList<>();
	    ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)return ans;
	    q.add(root);
	    boolean flag = true;
	    
	    
	    while(!q.isEmpty()){
	        
	        int n = q.size();
	        ArrayList<Integer> l = new ArrayList<>();
	        int[] row = new int[n];
	        for(int i=0 ; i<n  ; i++){
	           Node node = q.poll();
	           
	           int index = (flag)?i:(n-i-1);
	           row[index] = node.data;
	           
	           if(node.left!=null){
	               q.add(node.left);
	           }
	           if(node.right != null){
	               q.add(node.right);
	           }
	        }
	        
	        flag = !flag;
	        for(int val:row){
	            ans.add(val);
	        }
	        
	    }
	    return ans;
	    
	}
}


class Solution
{
    boolean check(Node root)
    {
	    int lastLevel = -1 , level = 0;
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	    while(!q.isEmpty()){
	        int n = q.size();
	        level++;
	        for(int i=0 ; i<n  ; i++){
	            Node temp = q.poll();
	            if(temp.left == null && temp.right==null){
	                if(lastLevel == -1)lastLevel = level;
	                else {
	                    if(lastLevel != level)return false;
	                }
	            }
	            if(temp.left!=null)q.add(temp.left);
	            if(temp.right!=null)q.add(temp.right);
	        }
	    }
	    return true;
    }
}

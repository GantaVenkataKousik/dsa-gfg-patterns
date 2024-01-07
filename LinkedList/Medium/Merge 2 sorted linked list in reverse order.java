
class GfG
{
    static Node reverse(Node head){
        Node curr = head , prev = null ,next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    Node mergeResult(Node node1, Node node2)
    {
	    node1 = reverse(node1);
	    node2 = reverse(node2);
	    
	    
	    Node dummy = new Node(-1);
	    Node tail = dummy;
	    
	    while(node1!=null && node2!=null){
	        if(node1.data >= node2.data){
	            tail.next = new Node(node1.data);
	            node1 = node1.next;
	        }
	        else{
	            tail.next = new Node(node2.data);
	            node2 = node2.next;
	        }
	        tail = tail.next;
	    }
	    
	    if(node1!=null){
	        tail.next = node1;
	    }
	    if(node2!=null){
	        tail.next = node2;
	    }
	    
	    return dummy.next;
    }
}

class Solution
{
    Node delete(Node head, int k)
    {
	    if(k==1)return null;
	    
	    int cnt = 1;
	    
	    Node temp = head;
	    while(temp!=null && temp.next!=null){
	        if(cnt+1 == k){
	            temp.next = temp.next.next;
	            cnt = 1;
	        }
	        else{
	            cnt++;
	        }
	        temp = temp.next;
	    }
	    return head;
    }
}

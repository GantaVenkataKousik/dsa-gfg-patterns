
class Solution {
    
    Node reverseList(Node head){
        Node prev = null , curr = head , next= null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public Node subLinkedList(Node head1, Node head2) {
        while(head1!=null && head1.data == 0 )head1 = head1.next;
        while(head2!=null && head2.data == 0 )head2 = head2.next;
    
        if(head1==null && head2==null)return new Node(0);
    
        if(head1 == null)return head2;
        if(head2 == null)return head1;
        

        
        int n1 =0 , n2 = 0;
        for(Node temp =head1 ; temp!=null ; temp = temp.next)n1++;
        for(Node temp = head2 ; temp!=null ; temp=temp.next)n2++;
        
        if(n2>n1){
            Node temp = head1;
            head1 = head2;
            head2 = temp;
        }
        if(n1==n2){
            Node temp1 = head1;
            Node temp2 = head2;
            while(temp1!=null && temp2!=null && temp1.data==temp2.data){
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            if(temp1!=null && temp1.data<temp2.data){
                Node temp = head1;
                head1 = head2;
                head2 = temp;
            }
        }
        
        head1 = reverseList(head1);
        head2 = reverseList(head2);
        
        Node dummy = new Node(-1);
        Node tail = dummy;
        
        int borrow = 0 , sum = 0;
        while(head1!=null && head2!=null){
                if(borrow == 1){
                    head1.data = head1.data-1;
                    if(head1.data>=head2.data){
                        borrow = 0;
                    }
                    else{
                        head1.data = head1.data+10;
                    }
                }
                else{
                    if(head1.data<head2.data){
                        head1.data = head1.data+10;
                        borrow = 1;
                    }
                }
                tail.next = new Node(head1.data-head2.data);
                tail = tail.next;
                
                head1 = head1.next;
                head2 = head2.next;
        }
        
            while(head1!=null){
                if(borrow == 1){
                    head1.data = head1.data-1;
                    if(head1.data < 0){
                        head1.data = 9;
                        borrow = 1;
                    }
                    else{
                        borrow = 0;
                    }
                }
                tail.next = new Node(head1.data);
                tail = tail.next;
                
                head1 = head1.next;
            }
   
            while(head2!=null){
                if(borrow == 1){
                    head2.data = head2.data-1;
                    if(head2.data < 0){
                        head2.data = 9;
                        borrow = 1;
                    }
                    else{
                        borrow = 0;
                    }
                }
                tail.next = new Node(head2.data);
                tail = tail.next;
                
                head2 = head2.next;
            }

        
        Node head = reverseList(dummy.next);
        while(head!=null && head.data==0){
            head = head.next;
        }
        
        if(head==null)return new Node(0);
        return head;
        
    }
    
}

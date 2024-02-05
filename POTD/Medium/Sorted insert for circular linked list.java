//User function Template for Java
class Solution {
    public Node sortedInsert(Node head, int data) {
        
        Node newNode=new Node(data);
        
        
        //Possibility 1:
        if(head==null){
            head=newNode;
            head.next=head;
        }
        
        
        //Possibility 2:
        else if(data<head.data){
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            head=newNode;
            newNode.next=temp.next;
            temp.next=head;
        }
        
        
        //Possibility 3:
        else{
            Node temp=head;
            while(temp.next!=head && data>temp.next.data){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        return head;
    }
}

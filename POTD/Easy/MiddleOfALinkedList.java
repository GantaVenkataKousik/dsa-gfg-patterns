class Solution {
    int getMiddle(Node head) {
        if(head==null)return -1;
        if(head.next==null)return head.data;
        Node slow = head , fast = head;
        do{
            slow = slow.next;
            fast = fast.next.next;
        }while(fast!=null && fast.next!=null);
        return slow.data;
    }
}

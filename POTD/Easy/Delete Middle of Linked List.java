class Solution {
    Node deleteMid(Node head) {
        
        if(head==null || head.next==null)return null;
        
        
        Node prev = null;
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = prev.next.next;
        
        return head;
        
    }
}

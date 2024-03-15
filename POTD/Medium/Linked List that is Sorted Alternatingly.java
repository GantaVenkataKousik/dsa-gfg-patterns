class Solution {
    
   public Node sort(Node head){
        List<Integer> l = new ArrayList<>();
        for(Node temp = head ; temp!=null ; temp=temp.next)l.add(temp.data);
        Collections.sort(l);
        Node dummy = new Node(-1);
        Node tail = dummy;
        for(int ele : l){
            tail.next = new Node(ele);
            tail = tail.next;
        }
        return dummy.next;
   }
}


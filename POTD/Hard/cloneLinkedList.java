class Solution {
    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        Map<Node,Node> mp = new HashMap<>();
        Node temp  = head;
        while(temp!=null){
            mp.put(temp,new Node(temp.data));
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            Node newNode = mp.get(temp);
            newNode.next = mp.get(temp.next);
            newNode.random = mp.get(temp.random);
            temp = temp.next;
        }
        return mp.get(head);
    }
}

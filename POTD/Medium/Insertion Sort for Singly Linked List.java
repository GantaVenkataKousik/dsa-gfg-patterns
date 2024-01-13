

//User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution
{
    public static Node insertionSort(Node head)
    {
        //code here
        Node sortedList = null;

        while (head != null) {
            Node current = head;
            head = head.next;

            if (sortedList == null || current.data < sortedList.data) {
                current.next = sortedList;
                sortedList = current;
            } else {
                Node temp = sortedList;
                while (temp.next != null && temp.next.data < current.data) temp = temp.next;
                current.next = temp.next;
                temp.next = current;
            }
        }

        return sortedList;
    }
}

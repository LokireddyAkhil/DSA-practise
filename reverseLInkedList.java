public class reverseLInkedList {
    // leetcode 206
    public  static Node reverse(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node current = head;
        Node previous=null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current ;
            current = next;
        }
        return previous;

    }
    public static  Node reverseList1(Node head) {
        // time complexity = o(n)
        // space complexity = o(n) these is space of call stack .
        if(head == null || head.next == null){
            return head;
        }
        Node a = head.next;
        Node nh = reverseList1(a);
        a.next = head;
        head.next=null;
        return nh;
    }
}

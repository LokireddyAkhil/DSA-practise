public class deleteleftmidddlenode {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.InsertAtLast(1);
        list.InsertAtLast(3);
        list.InsertAtLast(4);
        list.InsertAtLast(7);
        list.InsertAtLast(1);
        list.InsertAtLast(2);
        list.InsertAtLast(6);
        Node head1 = deleteMiddle(list.head);
        list.display();
    }
    public  static Node deleteMiddle(Node head) {
        if(head.next==null){
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

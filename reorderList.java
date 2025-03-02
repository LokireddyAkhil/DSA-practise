public class reorderList {
 // leetcode 143 .
//    T.c = o(n)
//    s.c = o(1)
    public void reorderList(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node snd = slow.next;
        slow.next = null;
        snd = reverseList(snd);
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (head != null & snd != null) {
            temp.next = head;
            head = head.next;
            temp = temp.next;
            temp.next = snd;
            snd = snd.next;
            temp = temp.next;
        }
        if (head == null) temp.next = snd;
        if (snd == null) temp.next = head;
        head = dummy.next;

    }

    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node a = head.next;
        Node nh = reverseList(a);
        a.next = head;
        head.next = null;
        return nh;
    }
}

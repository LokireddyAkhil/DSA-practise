public class copyRandomList{
class ListNode {
    int val;
    ListNode next;
    ListNode random;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
    public ListNode deepcopy(ListNode head) {
        if (head == null) return null;
        ListNode newHead = new ListNode(head.val);
        ListNode t1 = head.next;
        ListNode t2 = newHead;
        while (t1 != null) {
            ListNode temp = new ListNode(t1.val);
            t2.next = temp;
            t1 = t1.next;
            t2 = t2.next;
        }
        return newHead;
    }
    public void connectAlternatively(ListNode head, ListNode head2) {
        ListNode t1 = head;
        ListNode t2 = head2;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        while (t1 != null && t2 != null) {
            t.next = t1;
            t1 = t1.next;
            t = t.next;
            t.next = t2;
            t2 = t2.next;
            t = t.next;
        }
    }
    public static void assignRandom(ListNode head, ListNode head2) {
        ListNode t1 = head;
        ListNode t2;
        while (t1 != null) {
            t2 = t1.next;
            if (t1.random != null) t2.random = t1.random.next;
            t1 = t1.next.next;
        }
    }
    public static void split(ListNode head, ListNode head2) {
        ListNode t1 = head;
        ListNode t2 = head2;
        while (t1 != null) {
            t1.next = t2.next;
            t1 = t1.next;
            if (t1 == null)
                break;
            t2.next = t1.next;
            t2 = t2.next;
        }
    }
    public ListNode copyRandomList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = deepcopy(head);
        connectAlternatively(head, newHead);
        assignRandom(head, newHead);
        split(head, newHead);
        return newHead;
    }
}



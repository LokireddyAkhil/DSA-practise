public class SortSinglyLinkedList {
    // leetcode 148
    //T.C = O(NLOGN)
    //S.C  = O(LOGN)
    public static  Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node a = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node b = slow.next;
        slow.next = null;
        a = sortList(a);
        b = sortList(b);
        Node ans = merge(a,b);
        return ans;
    }
    public static  Node merge(Node head, Node second) {
        Node first = head;
        Node a = new Node(-1);
        Node b = a;
        while (first != null && second != null) {
            if (first.val > second.val) {
                a.next = second;
                second = second.next;
            } else {
                a.next = first;
                first = first.next;
            }
            a = a.next;
        }
        if (first == null) a.next = second;
        else a.next = first;
        return b.next;
    }
}

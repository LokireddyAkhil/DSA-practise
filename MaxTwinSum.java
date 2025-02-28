public class MaxTwinSum {
    public static int pairSum(Node head) {
        // t.c = o(n)
        // s.c - o(1)
        int maxSum =0;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node halfhead = slow;
        halfhead = reverseList(halfhead);
        while(halfhead!=null){
            if(maxSum<head.val+halfhead.val) maxSum = head.val+halfhead.val;
            head = head.next;
            halfhead = halfhead.next;
        }
        return maxSum;
    }
    public static  Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head ;
        Node previous = null;Node next;
        while (current != null) {
            next = current.next;current.next = previous;previous = current;
            current = next;
        }
        return previous;
    }
}

public class detectCycle {
    public static  Node detectCycle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node ans = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }
        if(fast!=slow) return null;
        // base case very important.
        while(ans!=slow){
            ans = ans.next;
            slow = slow.next;
        }
        return ans;
    }
}


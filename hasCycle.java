import java.util.Scanner;

public class hasCycle {
    public  static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return flag;
    }
}

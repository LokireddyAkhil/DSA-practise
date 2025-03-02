//public class SinglyLinkedList {
//}
class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class SinglyLinkedList {
    public ListNode head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // 1. Add at the beginning (addFirst)
    public void addFirst(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }
    // 2. Add at the end (addLast)
    public void addLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    // 3. Remove first node (removeFirst)
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }
    // 4. Remove last node (removeLast)
    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    // 5. Find a node (search)
    public boolean find(int val) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }
    // 6. Reverse the linked list (reverse)
    public void reverse() {
        ListNode prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    // 7. Get middle node (getMiddle)
    public ListNode getMiddle() {
        if (head == null) return null;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // 8. Detect cycle using Floyd’s Algorithm (detectCycle)
    public boolean detectCycle() {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
    // 9. Merge two sorted linked lists (mergeSortedLists)
    public static ListNode mergeSortedLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;
        return dummy.next;
    }
    // 10. Delete a node by value (delete)
    public void delete(int val) {
        if (head == null) return;
        if (head.val == val) {
            head = head.next;
            return;
        }
        ListNode temp = head;
        while (temp.next != null && temp.next.val != val) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    // 11. Display the linked list
    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Main function for testing
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        System.out.println("Linked List:");
        list.display();
        System.out.println("Finding 20: " + list.find(20));
        System.out.println("Middle Element: " + (list.getMiddle() != null ? list.getMiddle().val : "null"));
        System.out.println("Reversing List:");
        list.reverse();
        list.display();
        System.out.println("Removing First & Last Elements:");
        list.removeFirst();
        list.removeLast();
        list.display();
        System.out.println("Deleting 10:");
        list.delete(10);
        list.display();
    }
}


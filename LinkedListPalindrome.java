import java.util.ArrayList;

public class LinkedListPalindrome {
    public boolean isPalindrome(Node head) {
        // works for the most of the cases but fails for the cases like [1,1,2,1]
        Node temp =  head;
        Node newHead = reverseList(head);
        while(temp!=null && newHead !=null){
            if(temp.val!=newHead.val){
                return false;
            }
            temp = temp.next;
            newHead = newHead.next;
        }
        return true;
    }
    public Node reverseList(Node head) {
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
    public  static boolean isPalindrome1(Node head) {
        Node temp = head;
        // brute force.
        ArrayList<Integer> list = new ArrayList<>();

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Object arr[] = list.toArray();
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

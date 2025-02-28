import java.util.ArrayList;

public class LinkedListPalindrome {
//    public boolean isPalindrome(Node head) {
//        // works for the most of the cases but fails for the cases like [1,1,2,1]
//        Node temp =  head;
//        Node newHead = reverseList(head);
//        while(temp!=null && newHead !=null){
//            if(temp.val!=newHead.val){
//                return false;
//            }
//            temp = temp.next;
//            newHead = newHead.next;
//        }
//        return true;
//    }
     public boolean isPalindrome(Node head) {
         // better one
//         t.c = o(n)
//         s.c = o(n)
       if(head.next==null || head==null){
           return true;
       }
           Node newHead = new Node(head.val);
           Node t1 = head.next;
           Node t2 = newHead;
           while(t1!=null){
               Node temp = new Node(t1.val);
               t2.next = temp;
               t1 = t1.next;
               t2=t2.next;
           }
           newHead = reverseList(newHead);
           t1 = head;
           t2 = newHead;
           while(t1!=null){
               if(t1.val!=t2.val){
                   return false;
               }
               t1 = t1.next;
               t2=t2.next;
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
    public boolean isPalindrome4(Node head) {
         // t.c = o(n)
        // s.c = o(1)
        if (head.next == null || head == null) {return true;}
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node halfhead = slow;
        halfhead = reverseList(halfhead);
        while(halfhead!=null){
            if(head.val!=halfhead.val) return false;
            head = head.next;
            halfhead = halfhead.next;
        }
        return true;

    }
    public  static boolean isPalindrome1(Node head) {
        Node temp = head;
        // brute force.
//        t.c = o(n+logn)
//        s.c = o(n)
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
    public  static boolean isPalindrome2(Node head) {
        Node temp = head;
        // brute force.
//        t.c = o(n+logn)
//        s.c = o(n)
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

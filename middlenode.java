public class middlenode {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.InsertAtLast(10);
        list.InsertAtLast(90);
        list.InsertAtLast(20);
        Node middle = middleNode(list.head);
        System.out.println(middle.val);
    }
    public  static Node middleNode(Node head) {
        // t c = o(n) // number of passes = n + n/2; // two pass solution
        // s c = o(1)
        int size =0;
        Node temp = head;
        while(head != null){
            size++;
            head = head.next;
        }
        int mid = (size/2)+1;

        for(int i=1;i<=mid-1;i++){
            temp = temp.next;
        }
        return temp;
    }
    public  static Node middleNode1(Node head) {
        // for finding the right middle .
        // t c = o(n) // number of passes = n  // one pass solution
        // s c = o(1)

        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next !=null) /*null s next gives you error always first fast is
        equal to null then proceed to fast.next..*/{
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static  Node firstMiddleNode(Node head) {
        //  for finding the left middle
        Node slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // First middle node
    }
}

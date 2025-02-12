import java.util.Scanner;

public class removeNthNodeFromEnd {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.InsertAtLast(1);
        list.InsertAtLast(2);
        list.InsertAtLast(3);
        list.InsertAtLast(4);
        list.InsertAtLast(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
//        Node m = removeNthFromEnd(list.head,n);
//        list.display();
      Node k = removeNthFromEnd1(list.head,n);
       list.display();


    }
    public static Node removeNthFromEnd(Node head, int n) {
        // nth node from the end = len -n+1 from the starting
        if(head.next==null){
            return null;
        }
        Node temp = head;
        Node k1 = head;
        int len =0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        if(len == n){
            return head.next;
        }
        for(int i=1;i<=len-n-1;i++){
            k1=k1.next;
        }
        k1.next=k1.next.next;
        return head;

    }
    public static Node removeNthFromEnd1(Node head, int n) {
        if(head.next==null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

    }
}

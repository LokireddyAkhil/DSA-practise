import java.util.Scanner;

public class swapnodevaluesinLinkedList {
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
        Node k = swapNodes(list.head,n);
        list.display();
    }
    public static  Node swapNodes(Node head, int n) {
        Node temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp= temp.next;
        }Node left = head;
        Node right = head;
        for(int i=1;i<n;i++){
            left = left.next;
        }
        for(int i=1;i<len-n+1;i++){
            right = right.next;
        }
        int temp0 = right.val;
        right.val = left.val;
        left.val = temp0;
        return head;
    }
    public  static Node swapNodes1(Node head, int k) {
        Node left = head;
        Node right = head;
        for (int i = 1; i < k; i++) {
            left = left.next;
        }
        Node temp = left;
        while (temp.next != null) {
            temp = temp.next;
            right = right.next;
        }
        // here the distance from the left node from starting node is same as the distance from the right node form the end
        int tempVal = left.val;
        left.val = right.val;
        right.val = tempVal;

        return head;
    }

}



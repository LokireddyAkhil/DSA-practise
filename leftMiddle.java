import java.util.Scanner;

public class leftMiddle {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.InsertAtLast(1);
        list.InsertAtLast(2);
        list.InsertAtLast(3);
        list.InsertAtLast(4);
        list.InsertAtLast(5);
        list.InsertAtLast(6);
        Node k = leftMiddle(list.head);
        System.out.println(k.val);
        ndisplay(k);


    }
    public static void ndisplay(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static Node leftMiddle(Node head){
        // need to hadle test case for the even length
            Node temp = head;
            int size=0;
            while(temp!=null){
                size++;
                temp = temp.next;
            }
            int mid = (size/2)+1;
            int i = 1;
            Node ans = head;
            while(i<=mid-2){
                ans = ans.next;
                i++;
            }
            return ans;

    }
    public static Node  leftM(Node head){
        Node slow = head;
        Node fast = head;
        while (fast.next!=null && fast.next.next!=null){
            slow = slow .next;
            fast = fast.next.next;
        }
        return slow ;
    }

}

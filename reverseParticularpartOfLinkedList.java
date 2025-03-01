public class reverseParticularpartOfLinkedList {
//    leetcode 92
//    T.c = o(n)
//    s.c = o(n)
public  static Node reverseBetween(Node head, int left, int right) {
    if (head == null || head.next == null || left == right || left>right) {
        return head;
    }
    Node a = null;Node b = null;Node c = null;Node d = null;
    Node temp = head;int pos =1;
    while(temp!=null){
        if(pos==left-1) a=temp;if(pos==left) b=temp;if(pos==right) c=temp;if(pos==right+1) d=temp;
        pos++;temp=temp.next;
    }
    if(a!=null)a.next = null;if(c!=null)c.next = null;
    c = reverseList(b);
    if(a!=null)a.next=c;
    b.next=d;
    if(a==null) return c;
    return head;
}
    public static  Node reverseList(Node head){
        if( head==null || head.next==null){ return head ;}
        Node temp = head;
        Node a = temp.next;
        Node nh = reverseList(a);
        a.next=temp;
        temp.next=null;
        return nh;
    }
}

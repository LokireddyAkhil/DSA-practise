public class partitionLinkedlist {
    //leetCode 86
//    T.C = o(N)
//    s.c = o(1)
    public static Node partition(Node head, int x) {
        Node a = new Node(-1);Node b = new Node(-1);
        Node e = a;Node c = a;Node d = b;
        Node temp = head;
        while(temp!=null){
            if(temp.val<x){
                a.next = temp;
                a = a.next;
            }
            else{
                b.next = temp;
                b = b.next;
            }
            temp = temp.next;
        }
        b.next = null;
        a.next = null;
        Node g = c.next;
        if(c.next==null) return d.next; // very important base case
        // this case represents all the elements
        //in the linkedlist are equal to or greater than x
        while(c.next!=null){
            c= c.next;
        }
        c.next = d.next;
        return g;
    }
}

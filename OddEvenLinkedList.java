public class OddEvenLinkedList {
    // leetcode 328
    public Node oddEvenList(Node head) {
//        T.C = o(N)
//        s.c = o(1)
        Node a = new Node(-1);Node b = new Node(-1);
        Node c = a;Node d = b;
        Node temp = head;
        int index =1;
        while(temp!=null){
            if(index%2!=0){
                a.next = temp;
                a = a.next;
            }
            else{
                b.next = temp;
                b = b.next;
            }
            temp = temp.next;
            index+=1;
        }
        b.next = null;
        a.next = null;
        Node g = c.next;
        while(c.next!=null){
            c= c.next;
        }
        c.next = d.next;
        return g;
    }
}

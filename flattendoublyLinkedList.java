public class flattendoublyLinkedList {
    // leee=tcode 430.
//    Time Complexity:O(N)
//    Space Complexity:O(N)


class fNode {
    public int val;
    public fNode prev;
    public fNode next;
    public fNode child;
};
        public fNode flatten(fNode head) {
            fNode temp = head;
            while(temp!=null){
                fNode n = temp.next;
                if(temp.child!=null){
                    fNode c = flatten(temp.child);
                    fNode d = c;
                    while(d.next!=null){
                        d = d.next;
                    }
                    temp.next = c;
                    c.prev = temp;
                    d.next = n;
                    if(n!=null) n.prev =d ;
                    temp.child = null;
                }
                temp = n;
            }
            return head;
        }

}

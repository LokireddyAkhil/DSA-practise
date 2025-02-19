public class RemoveDuplicatesFromLinkedList {
    public static  Node deleteDuplicates(Node head) {
        //T.C =o(n)
        //s.c = o(1)
        if(head==null) return head;
        Node slow = head;
        Node fast = head.next;
        while(fast!=null ){
            if(fast.val == slow.val){
                fast = fast.next;
            }
            else{
                slow.next = fast;
                slow = fast;
            }

        }
        slow.next = null;
        return head;
    }
    public static  Node deleteDuplicates1(Node head) {
        //T.C =o(n)
        //s.c = o(1)
        Node temp = head;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                temp.val = temp.next.val;
                temp.next = temp.next.next;
            }
            else{
                temp =temp.next;
            }
        }
        return head;
    }
}

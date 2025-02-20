public class rotateSingleLinkedlist {
    public static  Node rotateRight(Node head, int k) {
        if(k==0 || head==null || head.next==null){
            // leetcode  61 .
            // base case  head = null k =0;// head = null k = 1; // len ==k
            // k>len and k%len ==0 in all these case return head;
            return head;
        }
        int len = 0;
        Node dum = head;
        while(dum!=null){
            len++;
            dum = dum.next;
        }
        if(k>len) k = k%len;
        if(k%len == 0) return head;
        if(k==len) return head;
        Node fast = head;
        for(int i=1;i<=k;i++){
            fast = fast.next;
        }
        Node slow = head;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        Node newHead = slow.next;
        fast.next = head;
        slow.next = null;
        return  newHead;
    }
}

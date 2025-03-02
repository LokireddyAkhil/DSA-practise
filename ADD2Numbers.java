public class ADD2Numbers {
    // leetcode 2
    // t.c = 0(max(m,n)
    // s.c = o(max(m,n)
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        int carry =0;
        while(l1!=null ||  l2!=null){
            int val1 = 0;
            int val2 = 0;
            if(l1!=null) val1 = l1.val;
            if(l2!=null) val2 = l2.val;


            int num = val1+val2+carry;
            Node new0 = new Node(num%10);
            temp.next = new0;
            temp = temp.next;
            if(num>9) carry =1;
            else{
                carry =0;
            }
            if(l1!=null)l1 = l1.next;
            if(l2!=null)l2 = l2.next;
        }
        if(carry==1){
            Node new0 = new Node(1);
            temp.next = new0;
            temp = temp.next;
        }
        return dummy.next;
    }
}

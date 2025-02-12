public class getIntersectionNode {
    public static void main(String[] args) {
        // leetcode 160.
        SLL list = new SLL();
        list.InsertAtLast(4);
        list.InsertAtLast(1);
        Node intersectNode = new Node(8);  // Common intersection node
        list.head.next.next = intersectNode;
        intersectNode.next = new Node(4);
        intersectNode.next.next = new Node(5);

        // Create second linked list: 5 -> 6 -> 1 -> (8 -> 4 -> 5)
        SLL list1 = new SLL();
        list1.InsertAtLast(5);
        list1.InsertAtLast(6);
        list1.InsertAtLast(1);
        list1.head.next.next.next = intersectNode;  // Connect to the 

        Node m = getIntersectionNode(list.head,list1.head);
        int a = m.val;
        System.out.println(a);
    }
    public  static Node getIntersectionNode(Node headA, Node headB) {
        Node tempa = headA;
        Node tempb = headB;
        int la =0;
        int lb =0;
        while(tempa!=null){
            la++;
            tempa =tempa.next;
        }
        while(tempb!=null){
            lb++;
            tempb= tempb.next;
        }
        tempa =headA;
        tempb = headB;
        int diff;
        if(la<lb){
            for(int i=1;i<=lb-la;i++){
                tempb=tempb.next;
            }
        }
        else{
            diff = la - lb;
            for(int i=1;i<=la-lb;i++){
                tempa=tempa.next;
            }
        }
        while(tempa!=tempb){
            tempa = tempa.next;
            tempb= tempb.next;
        }
        return tempa;
    }
}

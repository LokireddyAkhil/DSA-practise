public class Merge2LinkedList {
    // leetcode 21;
    public static  Node mergeTwoLists(Node head, Node second) {
        // time complexity = o(m+n)
        // space complexity = o(1);
        Node first =head;
        Node a = new Node(-1);
        Node b = a;
        while(first!=null && second!=null){
            if(first.val>second.val){
                a.next = second;
                second = second.next;
            }
            else{
                a.next = first;
                first = first.next;
            }
            a = a.next;
        }
        if(first==null) a.next=second;
        else a.next = first;
        return b.next;
    }
    public static Node mergeTwoLists1(Node list1, Node list2) {
        // time complexity = o(m+n)
        // space complexity  = o(m+n)
        Node dummy = new Node(-1);
        Node current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = new Node(list1.val);
                list1 = list1.next;
            } else {
                current.next = new Node(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }
        while (list1 != null) {
            current.next = new Node(list1.val);
            list1 = list1.next;
            current = current.next;
        }
        while (list2 != null) {
            current.next = new Node(list2.val);
            list2 = list2.next;
            current = current.next;
        }
        return dummy.next;
    }
}

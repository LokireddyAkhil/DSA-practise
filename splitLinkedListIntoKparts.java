public class splitLinkedListIntoKparts {
    // leetcode 725 .
//    t.c = O(n);
//     s.c = o(k);
    public static Node[] splitListToParts(Node head, int k) {
        int n = length(head);int size = n/k;int extra = n%k;
        Node arr[]= new Node[k];int idx=0;
        Node temp = head;int len =1;
        while(temp!=null){
            int s = size;
            if(extra>0) s++;
            if(len==1) arr[idx++]=temp;
            if(len==s){
                Node a = temp.next;
                temp.next = null; temp =a;len =1;extra--;
            }
            else{
                len++;temp = temp.next;
            }
        }
        return arr;
    }
    public static  int length(Node head){
        Node temp = head;
        int len=0;;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        return len;
    }
}

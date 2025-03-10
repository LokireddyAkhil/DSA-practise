public class ImplementationOfQueueOnLinkedList {
    public static void main(String[] args) {
        queuell q1 = new queuell();
        q1.add(10);
        q1.add(11);
        q1.add(12);
        q1.add(13);
        q1.display();
        q1.remove();
        q1.display();
        System.out.println(q1.size);
    }
    public static class NodeQ{
        int val;
        NodeQ next;
        NodeQ(int val){
            this.val=val;
        }
    }
    public static class queuell{
        NodeQ head = null;
        NodeQ tail = null;
        int size =0;
        public void add(int a){
                NodeQ temp = new NodeQ(a);
            if(size==0) {
                head = tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;

            }
            size++;
        }
        public int peek(){
            if(head==null) return -1;
            return head.val;
        }
        public int remove(){
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        public void display(){
            NodeQ temp = head;
            while(temp !=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }
    }
}

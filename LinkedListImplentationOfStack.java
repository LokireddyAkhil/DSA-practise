public class LinkedListImplentationOfStack {
    public static void main(String[] args) {
        StackLi st = new StackLi();
        st.push(1);
        st.display();
        st.push(2);
        st.display();

        st.push(3);
        st.display();

        int a = st.peak();
        System.out.println(a);
        int b = st.pop();
        System.out.println(b);
        System.out.println(st.size());
    }
    public static class StackLi {
        Node head = null;
        int idx =0;
        void push (int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            idx++;
        }
        int peak(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int value = head.val;

            return value;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int value = head.val;
            head = head.next;
            return value;
        }
        void displayreverse(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }

        }
        void displayrec(Node h){
            if(h==null){
                return;
            }
            displayrec(h.next);
            System.out.print(h.val);
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx==0) return true;
            return false;
        }



    }
}

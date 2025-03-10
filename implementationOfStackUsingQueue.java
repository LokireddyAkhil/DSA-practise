import java.util.LinkedList;
import java.util.Queue;

public class implementationOfStackUsingQueue {
    class MyStack {
        Queue<Integer> q = new LinkedList<>();//s.c = o(1);
        public MyStack() {}
        public void push(int x) {
            q.add(x);// t.c = o(1);
        }
        public int pop() {
            // t.c -= o(n)
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
            int val =  q.remove();return val;
        }
        public int top() {
            // t.c = o(n);
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
            int val = q.peek();
            q.add(q.remove());
            return val;
        }
        public boolean empty() {
            if(q.size()==0) return true;
            return false;
        }
    }
    class MyStack1 {
        Queue<Integer> q = new LinkedList<>();//s.c = o(1);
        public MyStack1() {}
        public void push(int x) {
            if(q.size()==0){
                q.add(x);
            }
            else{
                q.add(x);
                for(int i=0;i<q.size()-1;i++){
                    q.add(q.remove());
                }
            }
        }
        public int pop() {
            return q.remove();
        }
        public int top() {
            return q.peek();
        }
        public boolean empty() {
            if(q.size()==0) return true;
            return false;
        }
    }

}

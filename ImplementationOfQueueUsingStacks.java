import java.util.Stack;

public class ImplementationOfQueueUsingStacks {
    // leetcode 232.
    class MyQueue {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        public MyQueue() {}
        public void push(int x) {
            st.push(x);
        }
        public int pop() {
            while (st.size() > 1) {
                st1.push(st.pop());
            }
            int x = st.pop();
            while (!st1.isEmpty()) {
                st.push(st1.pop());
            }
            return x;
        }
        public int peek() {
            while (st.size() > 1) {
                st1.push(st.pop());
            }
            int x = st.peek();
            while (!st1.isEmpty()) {
                st.push(st1.pop());
            }
            return x;
        }
        public boolean empty() {
            return st.isEmpty();
        }
    }
}

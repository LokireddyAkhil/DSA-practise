import java.util.Stack;
// leetcode 155
public class MinStack {
    // t.c = o(1)
    //s.c = o(N)
    Stack<Integer > st = new Stack();
    Stack <Integer > mst = new Stack();
    public MinStack() {
    }
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            mst.push(val);
        }
        else{
            st.push(val);
            if(mst.peek()<=val){
                mst.push(mst.peek());
            }
            else{
                mst.push(val);
            }
        }
    }
    public void pop() {
        st.pop();
        mst.pop();
    }
    public int top() {
        return st.peek();

    }
    public int getMin() {
        return mst.peek();
    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


    class MinStack1 {
        // // t.c = o(1)
        //    //s.c = o(1)
        Stack<Long> st = new Stack<>();
        long min;

        public MinStack1() {
            min = Long.MAX_VALUE;
        }

        public void push1(int val) {
            long x = val;
            if (st.isEmpty()) {
                st.push(x);
                min = x;
            } else if (x >= min) {
                st.push(x);
            } else {
                st.push(2 * x - min);
                min = x;
            }
        }

        public void pop1() {
            if (st.isEmpty()) return;
            if (st.peek() >= min) {
                st.pop();
            } else {
                min = 2 * min - st.pop();
            }
        }

        public int top1() {
            long q = st.peek();
            if (q >= min) {
                return (int) q;
            } else {
                return (int) min;
            }
        }

        public int getMin1() {
            return (int) min;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}

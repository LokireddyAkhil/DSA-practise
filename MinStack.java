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
}

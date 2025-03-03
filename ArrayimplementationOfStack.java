public class ArrayimplementationOfStack {
    public static void main(String[] args) {
        Stack st = new Stack();
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
    public static class Stack {
        int arr[]= new int[5];
        int idx =0;
        void push (int x) {
            if (!isFull()) {
                arr[idx] = x;
                idx++;
            }
            else{
                System.out.println("Stack is full");
            }
        }
        int peak(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            else{
                return false;
            }
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            else return false;
        }
        int capacity(){
            return arr.length;
        }



    }
}

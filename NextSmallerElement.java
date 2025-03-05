import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int arr[]= {5,2,4,6,3,5};
        int res[]= nse(arr); // it returns the index of next smaller Element otherWise -1.
        print(res);
    }
    public static int[] nse(int arr[]){
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        res[arr.length-1]=-1;
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while (st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public static void print(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

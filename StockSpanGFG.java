import java.util.Stack;

public class StockSpanGFG {
    public static void main(String[] args) {
        int arr[]= {100, 80, 60, 70, 60, 75, 85};
        int res[]= CalculateSpan(arr);
        print(res);
    }
    public static int[] CalculateSpan(int arr[]){
        int n = arr.length;
        int res[]= new int[arr.length];
        res[0]=1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            res[i]=i-st.peek();
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

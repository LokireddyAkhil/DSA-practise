import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]= {1,3,2,1,8,6,3,4};
        int res[]= NGE(arr);
        print(res);
        int res1[]= NGE1(arr);
        print(res1);
    }
    public  static int[] NGE(int arr[]){
        // t.c = o(n^2);
        // s.c = o(1);
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i] = -1;
            for (int j=i+1; j<arr.length;j++){
                if(arr[j]>arr[i]){
                    res [i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }
    public  static int[] NGE1(int arr[]){
        int[] res = new int[arr.length];
        res[arr.length-1]=-1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            while (!st.isEmpty() && st.peek() < arr[i]) {

                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
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

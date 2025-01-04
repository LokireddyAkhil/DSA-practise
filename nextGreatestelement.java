import java.util.Arrays;

public class nextGreatestelement {
    public static void main(String[] args) {
        int arr[]= {12,8,60,37,2,49,16,28,21};
        int ans[]= new int[arr.length];
        ans[arr.length-1]=-1;
        int i = arr.length-2;
        int max = arr[arr.length-1];
        while(i>=0){
            ans[i]=max;
            max = Math.max(max,arr[i]);

            i--;
        }
        System.out.println(Arrays.toString(ans));
    }
}

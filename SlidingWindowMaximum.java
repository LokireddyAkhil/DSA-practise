import java.util.Stack;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int ans[]= new int[n-k+1];
        int z=0;
        int nge[]= NGE(nums);
        int j=0;
        for(int i=0;i<n-k+1;i++){
            if(j>=i+k) j=i;
            int max =nums[j];
            while(j<i+k){
                max = nums[j];
                j = nge[j];
            }
            ans[z++]=max;
        }
        return ans;

    }
    public   int[] NGE(int arr[]){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        st.push(arr.length-1);
        res[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i--){
            while (st.size()>0 && arr[i]>arr[st.peek()]) {
                st.pop();
            }
            if(st.size()==0) res[i]=arr.length;
            else res[i]=st.peek();
            st.push(i);
        }
        return res;
    }
}

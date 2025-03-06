import java.util.Stack;

public class largestAreaInHistogram {

    class Solution {
        public  static int largestRectangleArea(int[] arr) {
            int n = arr.length;
            int nse[] = nse(arr);
            int pse[] = pse(arr);
            int max = 0;
            for (int i = 0; i < n; i++) {
                int right = (nse[i] == -1) ? n : nse[i];
                int area = arr[i] * (right - pse[i] - 1);
                max = Math.max(area, max);
            }
            return max;
        }
        public static  int[] nse(int arr[]) {
            int n = arr.length;
            Stack<Integer> st = new Stack<>();
            int res[] = new int[n];

            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                    st.pop();
                }
                res[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i);
            }
            return res;
        }
        public  static int[] pse(int arr[]) {
            int n = arr.length;
            Stack<Integer> st = new Stack<>();
            int res[] = new int[n];

            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                    st.pop();
                }
                res[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i);
            }
            return res;
        }
    }

}

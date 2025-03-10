import java.util.*;

public class FIRSTNEGATIVEINTEGER {
    class Solution {
        public static List<Integer> firstNegativeInteger(int[] arr, int k) {
            List<Integer> result = new ArrayList<>();
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    queue.add(i);
                }
            }
            for (int i = 0; i <= arr.length - k; i++) {
                while (!queue.isEmpty() && queue.peek() < i) {
                    queue.poll();
                }
                if (!queue.isEmpty() && queue.peek() < i + k) {
                    result.add(arr[queue.peek()]);
                } else {
                    result.add(0);
                }
            }
            return result;
        }
    }

}

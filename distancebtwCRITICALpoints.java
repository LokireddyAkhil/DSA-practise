import java.util.*;
public class distancebtwCRITICALpoints {
    // leetcode 2058.
        public static int[] nodesBetweenCriticalPoints(Node head) {
//    Time Complexity: O(N)
//    Space Complexity: O(N)
            ArrayList<Integer> arl = new ArrayList<>();
            int len = 2;
            Node temp = head;
            while (temp.next != null && temp.next.next != null) {
                Node previous = temp;
                temp = temp.next;
                if ((temp.val > previous.val && temp.val > temp.next.val) ||
                        (temp.val < previous.val && temp.val < temp.next.val)) {
                    arl.add(len);
                }
                len++;
            }
            return fMMd(arl);
        }
        public static int[] fMMd(ArrayList<Integer> arl) {
            if (arl.size() < 2) {
                return new int[]{-1, -1};
            }
            Collections.sort(arl);
            int minDist = Integer.MAX_VALUE;
            int maxDist = arl.get(arl.size() - 1) - arl.get(0);

            for (int i = 1; i < arl.size(); i++) {
                minDist = Math.min(minDist, arl.get(i) - arl.get(i - 1));
            }

            return new int[]{minDist, maxDist};
        }
public static int[] nodesBetweenCriticalPoints1(Node head) {
//    Time Complexity: O(N)
//    Space Complexity: O(1)
    Node left = head;
    Node mid = head.next;
    Node right = head.next.next;
    int first = -1, last = -1, idx = 1;
    int[] arr = {-1, -1};
    int mind = Integer.MAX_VALUE;
    while (right != null) {
        if ((mid.val < left.val && mid.val < right.val) || (mid.val > left.val && mid.val > right.val)) {
            if (first == -1) first = idx;
            if (last != -1) {
                int dist = idx - last;
                mind = Math.min(dist, mind);
            }
            last = idx;
        }
        idx++;
        left = left.next;
        mid = mid.next;
        right = right.next;
    }
    if (first == last) return arr;
    arr[0] = mind;
    arr[1] = last - first;
    return arr;
}
    }


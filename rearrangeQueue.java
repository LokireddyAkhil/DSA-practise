import java.util.*;
public class rearrangeQueue {
    /*
    problem link ;
     https://www.geeksforgeeks.org/problems/interleave-the-
     first-half-of-the-queue-with-second-half/1?itm_source=
     geeksforgeeks&itm_medium=article&itm_campaign=practice_card

     */
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        // t.c = o(n)
        // s.c =o(n)
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ar = new ArrayList<>();
        int n = q.size();

        while (q.size() > n / 2) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        while (q.size() > n / 2) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());
        }
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        while (!q.isEmpty()) {
            ar.add(q.remove());
        }

        return ar;
    }
}

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicsOfQueue {
    public static void main(String[] args) {
//        Queue<Integer> qu = new ArrayDeque<>();  only valid are these 2.
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove(); // the poll method also works similar to remove .
        System.out.println(q);
        System.out.println(q.element()+"  "+ q.peek()); // peek and element returns the top element.
        int a = q.remove();
        System.out.println(a);
    }
}

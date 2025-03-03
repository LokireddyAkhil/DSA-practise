import java.util.Stack;
// LAST IN FIRST OUT
public class basicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
//        System.out.println(st.size()); //0
        st.push(1);st.push(2);st.push(3);st.push(4);st.push(5);
//        int a =st.peek();
//        System.out.println(a); //5
//        System.out.println(st); // 1 ,2,3,4,5
//        System.out.println(st.size()); // 5
//        System.out.println(st.pop()); //5
//        System.out.println(st); // 1,2,3,4
//        System.out.println(st.size()); // 4
//         Stack<Integer > reverse = reverse( st);
//        System.out.println(reverse);
//        Stack<Integer > copy = copy( st);
//        System.out.println(copy);
//        displayRecursively(st);
//        System.out.println(" ");
//        displayReverseRecursively(st);
    }
    public static  Stack<Integer> reverse (Stack<Integer> st){
        // t.c = o(n);
        // s.c =o(n);
        Stack <Integer> reverse = new Stack<>();
        while(st.size()>0){
            reverse.push(st.pop());

        }
        return reverse;
    }
    public static Stack <Integer> copy (Stack<Integer> st){
        // t.c = o(3n = n)
        // s.c = o(3n =n)
        Stack <Integer> temp  = reverse(st);
        Stack <Integer> copy = new Stack<>();
        while(temp.size()>0){
            copy.push(st.pop());
        }
        return copy;
    }
    public static Stack <Integer> PushBottom (Stack<Integer> st,int val){
        // t.c = o(3n = n)
        // s.c = o(3n =n)
        Stack <Integer> temp  = reverse(st);
        Stack <Integer> PushBottom = new Stack<>();
        PushBottom.push(val);
        while(temp.size()>0){
            PushBottom.push(st.pop());
        }
        return PushBottom;
    }
    public static Stack <Integer> PushAtIdx (Stack<Integer> st,int val,int pos){
        // t.c = o(3n = n)
        // s.c = o(3n =n)
        Stack <Integer> temp  = reverse(st); // handle the case no need to reveser whole tsack reverse it till pos
        Stack <Integer> PushAtIdx = new Stack<>();
        PushAtIdx.push(val);
        while(temp.size()>=pos){
            PushAtIdx.push(st.pop());
        }
        return PushAtIdx;
    }
    public static  void  displayRecursively (Stack<Integer> st){
        // t.c = o(n);
        // s.c = o(n); recursive stack
        if(st.isEmpty()) return;
        int top = st.pop();
        displayRecursively(st);
        st.push(top);
        System.out.print(top+" ");
    }
    public static  void  displayReverseRecursively (Stack<Integer> st){
        // t.c = o(n);
        // s.c = o(n); recursive stack
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRecursively(st);
        st.push(top);

    }

     public static class ArrayImplementation{

     }



}

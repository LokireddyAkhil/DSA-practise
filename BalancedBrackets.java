import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string containg brackets without spaces");
        String s = sc.nextLine();
        boolean ans = isBalance(s);
        System.out.println(ans);
    }

//    public static boolean isBalance(String s) {
//        Stack<Character> st = new Stack<>();
//        int n = s.length();
//        if(n%2==0){
//            for(int i=0;i<s.length();i++){
//                if(s.charAt(i)=='('){
//                    st.push(s.charAt(i));
//                }
//                else{
//                    if(st.isEmpty()) return false;
//                    if(st.peek()=='(') st.pop();
//                }
//            }
//            if(st.isEmpty()) return true;
//            else return false;
//        }
//        return false;
//    }
public static boolean isBalance(String s) {
    Stack<Character> st = new Stack<>();
    char ch[] = s.toCharArray();
    if (ch.length % 2 != 0) {
        return false;
    }
    for(int i=0;i< ch.length;i++){
        if(ch[i]=='('){
            st.push(ch[i]);
        }
        else{
            if(st.size()==0) return false;
            if(st.peek()=='(') st.pop();
        }
    }
    if(st.size()==0) return true;
    return false;
}
    public static boolean isValid(String s) {
        //leetcode 20.
//         Time Complexity: O(n)
// Space Complexity: O(n)
        Stack<Character> st = new Stack<>();
        char ch[] = s.toCharArray();
        if (ch.length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                st.push(ch[i]);
            } else {
                if (st.size() == 0)
                    return false;
                if (st.peek() == '(' || st.peek() == '{' || st.peek() == '[') {
                    if ((ch[i] == ')' && st.peek() == '(') ||
                            (ch[i] == '}' && st.peek() == '{') ||
                            (ch[i] == ']' && st.peek() == '[')) {
                        st.pop();
                    } else {
                        return false;
                    }

                }
            }
        }
        if (st.size() == 0)
            return true;
        return false;
    }


}

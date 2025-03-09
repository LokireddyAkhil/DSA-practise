import java.util.Stack;

public class PreFixToPostFix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        PreToPost(str);
    }
    public static void PreToPost(String str){
        Stack<String> val = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int asc = (int) ch;
            if(asc>=48 && asc<=57){
                String  t= "";
                t +=ch;
                val.push(t);
            }
            else{
                String val1 = val.pop();
                String val2 = val.pop();
                String t = "";
                t = val1+val2+ch;
                val.push(t);
            }
        }
        System.out.print(val.peek());
    }
}

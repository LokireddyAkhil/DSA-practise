import java.util.Stack;

public class PostFixToInFix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        PostToInf(str);
    }
    public static void PostToInf(String str){
        Stack<String> val = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int asc = (int) ch;
            if(asc>=48 && asc<=57){
                String  t= "";
                t +=ch;
                val.push(t);
            }
            else{
                String val2 = val.pop();
                String val1 = val.pop();
                String t = "";
                t = "("+val1+ch+val2+")";
                val.push(t);
            }
        }
        System.out.print(val.peek());
    }
}

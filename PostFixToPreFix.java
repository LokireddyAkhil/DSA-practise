import java.util.Stack;
public class PostFixToPreFix {

    public static void main(String[] args) {
            String str = "953+4*6/-";
            PostToPre(str);
        }
        public static void PostToPre(String str){
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
                    t = ch+val1+val2;
                    val.push(t);
                }
            }
            System.out.print(val.peek());
        }
    }



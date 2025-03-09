import java.util.Stack;

public class PostFix {
    public static void main(String[] args) {
        String PostFix = "953+4*6/-";
        EvaPostFix(PostFix);

    }
    public static void EvaPostFix(String str){
        Stack<Integer> val = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int Asc = (int) ch ;
            if(Asc>=48 && Asc<=57){
                val.push(Asc-48);
            }
            else {
                int v2 = val.pop();
                int v1 = val.pop();
               if(ch =='+') val.push(v1+v2);
               if(ch =='-') val.push(v1-v2);
               if(ch =='*') val.push(v1*v2);
               if(ch =='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}

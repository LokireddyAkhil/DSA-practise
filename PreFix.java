import java.util.Stack;

public class PreFix {
    public static void main(String[] args) {
        String PostFix = "-9/*+5346";
        EvaPreFix(PostFix);
    }
    public static void EvaPreFix(String str){
        Stack<Integer> val = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int Asc = (int) ch ;
            if(Asc>=48 && Asc<=57){
                val.push(Asc-48);
            }
            else {
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch =='+') val.push(v1+v2);
                if(ch =='-') val.push(v1-v2);
                if(ch =='*') val.push(v1*v2);
                if(ch =='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}

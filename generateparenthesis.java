import java.util.Scanner;

public class generateparenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        gp(0,0,a,"");
    }
    public static void gp(int open,int close,int n,String s){
        /*
        The time and space complexity of the generateParenthesis
         function is O(4ⁿ / √n) due to the Catalan number growth, which
         represents the number of valid sequences.
        */
        if(s.length()==n*2){
            System.out.println(s);
            return;
        }
       if(open<n) gp(open+1,close,n,s+'(');
       if(close<open)gp(open,close+1,n,s+')');
    }
}

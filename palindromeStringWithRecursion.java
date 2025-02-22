import java.util.Scanner;

public class palindromeStringWithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.next();
        boolean ans = palin(s);
        System.out.println(ans);


    }
    public static boolean palin(String s){
        if(s.length()==1) {
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
             return palin(s.substring(1,s.length()-1));
        }
        else{
            return false;
        }
    }
}


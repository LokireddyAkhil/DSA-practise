import java.util.Scanner;
import java.util.SimpleTimeZone;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        String s = CAS(a);
        System.out.println(s);
    }
    public static String CAS(int n){
        if(n==1) return "1";
        String s = CAS(n-1);
        String ans ="";
        int i=0;int j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) {
                j++;
            }
            else{
                int len = j-i;
                ans += len;
                ans += s.charAt(i);
                i=j;
            }
        }
        int len = j-i;
        ans += len;
        ans += s.charAt(i);
        return ans;
    }
    
}

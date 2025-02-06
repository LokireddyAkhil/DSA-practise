import java.util.Scanner;

public class BinaryStringsno21s {
    // generate all binary strings of length n without consecutive ones
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length ");
        int a = sc.nextInt();
        BS("",a);

    }
    public static void BS(String ans,int n){
        int m = ans.length();
        if(m==n){
            System.out.println(ans);
            return;
        }
        if(m==0 || ans.charAt(m-1)=='0'){
            BS(ans+1,n);
            BS(ans+0,n);
        }
        else{
            BS(ans+0,n);
        }
    }
}

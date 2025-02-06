import java.util.Scanner;

public class GCD {
    //HCF OF (A,B) <= MINIMUM(A,B)
    // LCM OF (A,B) >= MAXIMUM(A,B)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        hcf(a,b);
       int c=  gcd(a,b);
        System.out.println(c);

    }
    public static int  gcd(int a,int b){
        if(b%a==0) return a;
        return gcd(b%a,a);
    }
    public static  void hcf(int a,int b) {
        // time complexity = O(min(a,b))
        int min = a>b?a:b;
        for(int i= min;i>0;i--){
            if(a%i==0 && b%i==0){
                System.out.println("hcf of "+a+" "+b+" is  "+i);
                break;
            }
        }
    }

}



import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int a = sc.nextInt();
        int b = fac(a);
        System.out.println(b);

    }
    public static int fac(int a ){
        if(a==0){
            return 1;
        }
      return a * fac(a-1);
    }
}

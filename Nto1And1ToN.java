

import java.util.Scanner;

public class Nto1And1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a =sc.nextInt();
        print(a);
        printa(0,a);

    }
    public static void print(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        print(a-1);
    }
    public static void printa(int n, int a) {
        if (n > a) {
            return;
        }
        System.out.println(n);
        printa(n + 1, a);
    }

}

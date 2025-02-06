import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        int b = fibo(a);
        System.out.println(b);
    }
    public static int fibo(int a){
        // Time complexity = O(a)
        if(a<=1) return a;
        return fibo(a-1)+fibo(a-2);
    }
}

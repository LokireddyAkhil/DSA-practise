import java.util.Arrays;
import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        System.out.println(a | b); //returns 1 if any one of the bit is one
        System.out.println(a & b); // retruns 1 if both bits are 1
        System.out.println(a ^ b);// returns 1 if both the bits are differnt
        System.out.println(a >> 1); // right shifts the bit by 1  //a>>b= a/2^b
        System.out.println(a << 1);// left shifts the bit by 1   // a<<b = a*2^b
    }
}
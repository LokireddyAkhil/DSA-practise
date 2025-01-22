import java.util.Arrays;
import java.util.Scanner;

public class Assigncookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter greed factor array size");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter minimum size of cookie array size");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter size 2");
        int size1 = sc.nextInt();
        int arr1[]= new int[size1];
        System.out.println("enter elements");
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]=sc.nextInt();
        }
        int maxCookies = findContentChildren(arr,arr1);
        System.out.println(maxCookies);

    }
    public  static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int lp = 0;
        int rp = 0;
        while(lp<g.length && rp<s.length){
            if(g[lp]<=s[rp]){
                lp++;
                rp++;
            }
            else{
                rp++;
            }
        }
        return lp;
    }

}

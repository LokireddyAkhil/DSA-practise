import java.util.Scanner;
public class Queriesprefixsum {
    public static void main(String[] args) {
        System.out.println("enter arraysize");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        System.out.println("enter elements");
        for (int i = 1; i <=size; i++) {
            arr[i] = sc.nextInt();
        }
        int freq[]= farr(arr);
        printarray(freq);
        System.out.println("number  of queries");
        int q = sc.nextInt();
        while (q>0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans =freq[r]-freq[l-1];
            System.out.println(ans);
            q--;
        }

    }
    public static int[] farr(int[] arr){

        for (int i = 1; i <arr.length ; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

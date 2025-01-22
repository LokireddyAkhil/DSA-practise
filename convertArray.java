import java.util.Arrays;
import java.util.Scanner;

public class convertArray {
    public static void main(String[] args) {
        /*
        Q8: Given an array with N distinct elements, convert the given array to
        a form where all elements are in the range from 0 to N-1. The order of
        elements is the same, i.e., O is placed in the place of the smallest element,
         1 is placed for the second smallest element, ... N-1 is placed for the largest element.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        convertArray(arr);

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void convertArray(int arr[]){
        int brr[]= new int[arr.length];
        for(int i=0;i<brr.length;i++){
            brr[i]=arr[i];
        }
        Arrays.sort(brr);
        for(int i=0;i< arr.length;i++){
            for(int j =0;j<brr.length;j++){
                if(arr[i]==brr[j]){
                    arr[i]=j;
                }
            }
        }
        print(arr);
    }
}

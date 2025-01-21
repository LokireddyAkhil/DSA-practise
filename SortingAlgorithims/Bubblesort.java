package SortingAlgorithims;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            boolean flag = true;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true){
                break;
            }

        }
        System.out.println(Arrays.toString(arr));
        // max swap in an n sized array (worest case) (n*(n-1))/2
    }
}

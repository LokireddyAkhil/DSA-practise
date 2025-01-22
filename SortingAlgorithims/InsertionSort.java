package SortingAlgorithims;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        InsertionSort(arr);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void InsertionSort(int arr[]){
        print(arr);
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        print(arr);
        // best case t.c = o(n)
        // avg and worest t.c = O(n^2)
        // maximum number of swaps = (n*(n-1))/2
        // insertion sort is a stable sort
    }
}

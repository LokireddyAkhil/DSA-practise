package SortingAlgorithims;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);

    }
    public static void selectionSort(int arr[]){
        print(arr);
        for(int i=0;i<arr.length-1;i++){
            int min = Integer.MAX_VALUE;
            int midx=-1;
            for(int j=i;j< arr.length;j++){
                if(arr[j]<min){
                    min =arr[j];
                    midx=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[midx];
            arr[midx]=temp;
        }
        print(arr);

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    // time complexity = o(n^2);
//    selection sort is an unstable sort
// total number of swaps = (n-1) this is the main reason why selection sort is better. if in the question they asked to us to consider the cost of swaping
    // in best case also the time complexity is o(n^2) where as in bubble sort best case time complexity is o(n) i reapt if we want to consider the cost of swaping then only selection sort is better and in all other cases bubble sort is better


}

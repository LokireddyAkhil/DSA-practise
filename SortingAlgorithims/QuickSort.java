package SortingAlgorithims;

import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args) {
        System.out.println("size of array ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter array elements");
        int arr[] = new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("array");
        printarray(arr);
        System.out.println(" ");
        System.out.println("sortedarray");
        Quciksort(arr,0, arr.length-1);
        printarray(arr);
    }
    public static void printarray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
//
    }
    public static void swap(int arr[],int fi,int si){
        int temp = arr[fi];
        arr[fi] = arr[si];
        arr[si] = temp;
    }
    public static int partion(int arr[], int low, int high){
        int i =low;
        int j =high;
        int pivot = arr[low];
        while(i<j){
            while(i <= high && arr[i]<=pivot) {i++;}
            while(j > low && arr[j]>pivot) {j--;}
            if(i<j) {
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    public static void Quciksort(int arr[],int low, int high){
        if(low<high){
            int pivot = partion(arr,low,high);
            Quciksort(arr,low,pivot-1);
            Quciksort(arr,pivot+1,high);


        }
    }


}



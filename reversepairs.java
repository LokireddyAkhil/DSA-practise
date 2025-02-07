import SortingAlgorithims.MergeSort;

import java.util.Scanner;

public class reversepairs {
    public static void main(String[] args) {
        /*Given an integer array nums, return the number of reverse pairs in the array.
            A reverse pair is a pair (i, j) where:
            0 <= i < j < nums.length and
            nums[i] > 2 * nums[j].*/ // leetcode 493.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int a = sc.nextInt();
        System.out.println("enter array elemnts");
        int arr[]= new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int b =reversePairs(arr);
        System.out.println(b);
    }
    static  int count ;
    public static int reversePairs(int[] arr) {
        count=0;
        MergeSort(arr);
        return count;

    }
    public static  void IC(int a[],int b[]){
        int i=0;int j=0;
        while(i<a.length && j<b.length){
            if(a[i]>((long)2*(long)b[j])){
                count += a.length-i;
                j++;
            }
            else i++;
        }
    }
    public static   void MergeSort(int arr[]){
        int n = arr.length;
        if(n==1) return;
        int a[]= new int[n/2];
        int b[]= new int[n-n/2];
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int j=0;j<n-n/2;j++){
            b[j]=arr[j+n/2];
        }
        MergeSort(a);
        MergeSort(b);
        IC(a,b);
        Merge(a,b,arr);
    }
    public   static void Merge(int a[], int b[], int c[]){
        int i=0;int j=0;int k=0;
        while(i<a.length && j< b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
    }
}

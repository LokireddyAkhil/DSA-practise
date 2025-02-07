import SortingAlgorithims.MergeSort;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class InversionsCount {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int a = sc.nextInt();
        System.out.println("enter array elements");
        int arr[]= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int c = CI(arr);
        System.out.println(c);
        MergeSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
    public static int CI(int arr[]){
        // time complexity = O(n^2)
        int CI=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[i]){
                    CI++;
                }
            }
        }
        return CI;

    }
    public static void IC(int arr[],int brr[]){
        int i=0;int j=0;
        while(i<arr.length && j<brr.length){
            if(arr[i]>brr[j]){
                count+=(arr.length-i);
                j++;
            }
            else i++;
        }
    }
    public static void MergeSort(int arr[]){
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
    public static void Merge(int arr[], int brr[], int crr[]){
        int i=0;int j=0;int k=0;
        while(i<arr.length && j< brr.length){
            if(arr[i]<brr[j]){
                crr[k++]=arr[i++];
            }
            else{
                crr[k++]=brr[j++];
            }
        }
        while(j<brr.length){
            crr[k++]=brr[j++];
        }
        while(i<arr.length){
            crr[k++]=arr[i++];
        }
    }
}

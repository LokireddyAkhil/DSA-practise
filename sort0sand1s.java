import java.util.Arrays;
import java.util.Scanner;

public class sort0sand1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        System.out.println("enter array elemnts");
        int arr[]= new int[size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= sc.nextInt();
        }
     //  Arrays.sort(arr);  // brute force
        optimal(arr);




    }
    public static void better(int arr[]){
        int n0=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                n0++;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(i<n0){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void optimal(int arr[]){
        int i=0;
        int j =arr.length-1;
        while(i<j){
           if(arr[i]==0){
               i++;
           } else if (  arr[j]==1) {
               j--;
           } else {
               if (arr[i] != arr[j]) {
                   arr[i] = arr[i] + arr[j];
                   arr[j] = arr[i] - arr[j];
                   arr[i] = arr[i] - arr[j];
               }
           }
        }
        System.out.println(Arrays.toString(arr));
    }
}

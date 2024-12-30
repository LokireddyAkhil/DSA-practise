import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter array elements");
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        rotateArray(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseParticluarPartArray(int arr[], int s,int e){
        int i =s;
        int j =e;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void rotateArray(int arr[], int k){
        // the brute force for this one is creating the extra array copy the last k elements from the original array
        // and copy it into extra array by traversing backwards now by traversing from first copy the first n-k-1
        // elements now overwrite the original array by using created array
        k=k % arr.length;
        // optimal one
        reverseParticluarPartArray(arr,0,arr.length-1); // 5 4 3 2 1
        reverseParticluarPartArray(arr,0, k-1); // 3 4 5 2 1
        reverseParticluarPartArray(arr,k, arr.length-1); // 3 4 5 1 2
    }
    public static void swap(int arr[],int i,int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
}

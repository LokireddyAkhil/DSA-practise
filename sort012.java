import java.util.Scanner;

public class sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter arrayelements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        dfa(arr);
        print1dArray(arr);
    }
    public static void dfa(int arr[]){
        int low = 0;
        int mid =0;
        int high =arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if (arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }

    }
    public  static void swap (int arr[],int i,int j){
        arr[i]= arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
    public static void print1dArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

    }
}
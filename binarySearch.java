import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        System.out.println("Enter array size ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter taget");
        int t = sc.nextInt();
        binarysearch(arr,t);
    }
    public static void binarysearch(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid]==target){
                System.out.println(arr[mid]);
                return;
            }
            else if( arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
    }
}
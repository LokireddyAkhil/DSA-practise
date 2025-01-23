import java.util.Scanner;

public class peakIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int a = peakIndex1(arr);
        System.out.println(a);
        int b = peakIndex2(arr);
        System.out.println(b);
        int c = peakIndex3(arr);
        System.out.println(c);
    }
    public static  int peakIndex1(int[] arr) {
        int a =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                a=i;
                break;
            }
        }
        return a;

    }
    // no logic but works
    public static  int peakIndex2(int[] arr) {
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                high = mid-1;
            }

        }
        return 0;

    }
    public  static int peakIndex3(int[] arr) {
        int low =1;
        int high = arr.length-2;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]&& arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else if(arr[mid]<arr[mid-1]&& arr[mid]>arr[mid+1]){
                high = mid-1;
            }

        }
        return 0;

    }
}

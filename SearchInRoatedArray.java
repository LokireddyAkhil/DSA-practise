import java.util.Scanner;

public class SearchInRoatedArray {
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2};
//        int arr[]= {4};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter target");
        int target = sc.nextInt();
       int k = target1(arr,target);
        System.out.println(k);
    }
    public static int target(int [] arr, int t) {
        //1st approach linear search  time complexity O(n) space complexity O(1)
        // 2nd approach sort the array or rotate the array back to orignal array  time complexity = O(n) and space complexity = O(1)
        int low1 = 1;
        int high1 = arr.length - 2;
        int pivot = -1;
        while (low1 <= high1) {
            int mid = low1 + (high1 - low1) / 2;
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    pivot = mid;
                    break;
                }else if (arr[mid]<arr[mid-1]&& arr[mid]<arr[mid+1]){
                    pivot = mid-1;
                    break;
                } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                    if (arr[mid] > arr[arr.length-1]) {
                        low1 = mid + 1;
                    } else if (arr[mid] < arr[arr.length-1]) {
                        high1 = mid - 1;
                    }
                }
        }
        if (pivot == -1) {
            return bs(arr, 0, arr.length - 1, t);
        }
        int low2 = 0;
        int high2 = pivot;
        int h = bs(arr, low2, high2, t);
        if (h !=-1) return h;
        int low3 = pivot + 1;
        int high3 = arr.length - 1;
        int z = bs(arr, low3, high3, t);
        return z;
    }
    public static int bs(int arr[],int low,int high,int x){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==x){
                return mid;
            } else if (arr[mid]>x) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static int target1(int arr[],int t){
        int low = 0;
         int high =arr.length-1;
         while(low<=high){
             int mid = low + (high-low)/2;
             if(arr[mid]== t){
                 return mid;
             }
             if (arr[mid]<arr[high]) {
                 if(arr[mid]<t && t<=arr[high]){
                     low = mid+1;
                 }
                 else{
                     high = mid-1;
                 }
             }
             else if(arr[mid]>arr[high]){
                 if(t>=arr[low] && t<arr[mid]){
                     high = mid-1;

                 }
                 else {
                     low = mid+1;
                 }
             }
         }
         return -1;
    }
}


import java.util.Scanner;

public class FirstAndlast {
    public static void main(String[] args) {
        int arr[]={10,10,20,20,20,20,20,30,30,30,40,50};
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int left =0;
        int right = arr.length-1;
        int lb = arr.length;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid]>=t){
                lb = Math.min(lb,mid);
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        int ub =0;
        while(left<=right){

            int mid = left +(right-left)/2;
            if(arr[mid]>=t){
                ub = Math.min(lb,mid)-1;
                right = mid-1;
            }
        }
    }
//    class Solution {    1st approach
//        public int[] searchRange(int[] arr, int x) {
//            int[] brr = {-1, -1};
//            int low = 0;
//            int high = arr.length-1;
//            boolean flag =false;
//            while(low<=high){
//                int mid = low + (high-low)/2;
//                if(arr[mid]== x){
//                    flag = true;
//                    break;
//                }
//                else if(arr[mid]>x){
//                    high = mid-1;
//                }
//                else{
//                    low = mid+1;
//                }
//            }
//            if(flag){
//                int lb = LowerBound(arr,x);
//                int Ub = upperBound(arr,x)-1;
//                brr[0]=lb;
//                brr[1]=Ub;
//            }
//
//            return brr;
//        }
//        public static int LowerBound(int arr[],int x){
//            int lb = arr.length;;
//            int low =0;
//            int high = arr.length-1;
//            while(low<=high){
//                int mid = low+ (high-low)/2;
//                if(arr[mid]>=x){
//                    lb = Math.min(lb,mid);
//                    high = mid-1;
//                } else {
//                    low = mid+1;
//                }
//            }
//            return lb;
//        }
//        public static int upperBound(int arr[],int x){
//            int ub = arr.length;;
//            int low =0;
//            int high = arr.length-1;
//            while(low<=high){
//                int mid = low+ (high-low)/2;
//                if(arr[mid]>x){
//                    ub = Math.min(ub,mid);
//                    high = mid-1;
//                } else {
//                    low = mid+1;
//                }
//            }
//            return ub;
//        }
//    }
}

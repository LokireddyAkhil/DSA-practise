
import java.util.Scanner;

public class lowerbound {
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
        lowerBound(arr,t);


//        int arr[] = {12,14,19,19,42,52,62,82,88,88,100};     // pw approach
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int lb = arr.length;
//        int left =0;
//        int right = arr.length-1;
//        while(left<=right){
//            int mid = left +(right - left)/2;
//            if(arr[mid]>=t){
//                lb = Math.min(lb,mid);
//                right=mid-1;
//            }
//            else {
//                left = mid+1;
//            }
//            //
//
//        }
//        System.out.println(lb);



        //    int left =0;
//    int right = arr.length-1;
//        while(left<=right){
//        int mid = (left+right)/2;
//        if(arr[mid]<t){
//            left = mid+1;
//        } else if (arr[mid]>t) {
//            right=mid-1;
//        }
//        else {f
//            if(mid ==0 ){ System.out.println(mid);
//                break;}
//            if(arr[mid-1]>=t){
//                System.out.println(mid-1);
//            }
//            else
//                System.out.println(mid);
//            break;
//        }
//    }
    }
    public static void   lowerBound(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid]>=target && arr[mid-1]<target){
                System.out.println(mid);
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

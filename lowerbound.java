
import java.util.Scanner;

public class lowerbound {
    public static void main(String[] args) {
        int arr[] = {12,14,19,19,42,52,62,82,88,88,100};
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int lb = arr.length;
        int left =0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left +(right - left)/2;
            if(arr[mid]>=t){
                lb = Math.min(lb,mid);
                right=mid-1;
            }
            else {
                left = mid+1;
            }
            //

        }
        System.out.println(lb);
        //    int left =0;
//    int right = arr.length-1;
//        while(left<=right){
//        int mid = (left+right)/2;
//        if(arr[mid]<t){
//            left = mid+1;
//        } else if (arr[mid]>t) {
//            right=mid-1;
//        }
//        else {
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

}

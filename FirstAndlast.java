
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
                lb = Math.min(lb,mid);
                right = mid-1;
            }
        }
    }
}

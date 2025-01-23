import java.util.Scanner;

public class sqrtofx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

    }
    public  static  void  mySqrt(int x) {
         System.out.println( (int)(Math.sqrt(x)));
     }
     public static void mysqrt1(int x){
        int ans =0;
        for(int i=0;i<=x;i++){
            if(i*i<=x){
                ans =i;
            }
            else{
                break;
            }
            System.out.println(ans);
        }
     }
    public static void mySqrt2(int x) {
        long low =0;
        long high =x;
        while(low<=high){
            long mid = low + (high-low)/2;
            if(mid*mid==x){
                System.out.println((int)mid);
            }
            else if(mid*mid<x){
                low = mid+1;
            }
            else if(mid*mid>x){
                high = mid-1;
            }
        }
         System.out.println((int)high);
    }

}

import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter array elements");
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int t = sc.nextInt();
        int brr[] = twoSum(arr,t);
        System.out.println(Arrays.toString(brr));


    }
    public static int[] twoSum(int[] arr, int t) {
        // brute code
        int brr[] = new int[2];
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==t){
                    brr[0]=i;
                    brr[1]=j;
                }
            }
        }
        return brr;
    }
}

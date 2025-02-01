import java.util.Arrays;

public class smallestDivisor3shold {
    public static void main(String[] args) {
        int[] arr = {44,22,33,11,1};
        int a = smallestDivisor(arr,5);
        int b = smallestDivisor1(arr,5);
        System.out.println(a);
        System.out.println(b);
    }
    public  static int smallestDivisor(int[] arr, int td) { // may not work for some test case
        // time complexity = O(n+O(d*n))
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int  d ;
        for(d=1;d<=max;d++){
            int sum =0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%d==0){
                    sum += arr[i]/d;
                }
                else{
                    sum += arr[i]/d + 1;
                }
            }
            if(sum<=td){
                return d;
            }
        }
        return  d;
    }
    public static int smallestDivisor1(int[] arr, int td) {
        // time complexity = O(n*log mx) space complexity = o(1)
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int low =1;
        int high = max;
        int d=1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int sum =0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%mid==0){
                    sum += arr[i]/mid;
                }
                else{
                    sum += arr[i]/mid + 1;
                }
            }
            if(sum<=td){
                d = mid;
                high = mid-1;;
            }
            else{
                low = mid+1;
            }
        }
        return d;
    }
}


public class shipCapacityDedays {
    public static void main(String[] args) {
        int arr[]= {3,2,2,4,1,4};
        int a = shipWithinDays(arr,3);
        System.out.println(a);
    }
    public static  int shipWithinDays(int[] arr, int d) {
        int max = Integer.MIN_VALUE;
        int tsum =0;
        for(int i=0;i<arr.length;i++){
            tsum+=arr[i];
            if(max<arr[i]){
                max=arr[i];
            }

        }
        int low =max;
        int high = tsum;
        int minC = tsum;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isValid(mid,arr,d)==true){
                minC = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return minC;
    }
    public static  boolean isValid(int cap,int arr[],int d){
        int load =0;
        int days =1;
        for(int i=0;i<arr.length && d>0;i++){
            if(load+arr[i]<=cap){
                load+=arr[i];
            }
            else{
                load=arr[i];
                days++;
            }
        }
        if(days>d) return false;
        else return true;
    }
}

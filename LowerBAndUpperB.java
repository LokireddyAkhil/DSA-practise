public class LowerBAndUpperB {
    public static void main(String[] args) {
        int arr[]= {10,11,23,35,47,88,97,98,99};
        LowerBound(arr,40);
        upperBound(arr,23);


    }
    public static void LowerBound(int arr[],int x){
        int lb = arr.length;;
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(arr[mid]>=x){
                lb = Math.min(lb,mid);
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        System.out.println(lb);
    }
    public static void upperBound(int arr[],int x){
        int lb = arr.length;;
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(arr[mid]>x){
                lb = Math.min(lb,mid);
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        System.out.println(lb);
    }
}

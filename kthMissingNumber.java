public class kthMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int a = findKthPositive(arr,2);
        System.out.println(a);

    }
    public  static int findKthPositive(int[] arr, int k) {
        int low =0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            // value -(index+1)
            int  mis = arr[mid]-(mid+1);
            if(mis<k){
                low = mid+1;
            }
            else {
                high= mid-1;
            }
        }
        // return arr[high]+k-(arr[high]+1-high);
        // return k+high+1;
        return k+low;
    }
}

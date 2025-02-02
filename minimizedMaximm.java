public class minimizedMaximm {
    public static void main(String[] args) {
        int arr[]={2,10,6};
        int a = minimizedMaximum(3,arr);
        System.out.println(a);
    }
    public static int minimizedMaximum(int n, int[] arr) {
        int lmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (lmax < arr[i]) {
                lmax = arr[i];
            }
        }
        int low = 1;
        int high = lmax;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(mid, n, arr)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    public  static boolean isValid( int mid,int n ,int arr[]){
        int stores =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%mid==0){
                stores += arr[i]/mid;
            }
            else{
                stores+=(arr[i]/mid)+1;
            }

        }
        if(stores>n) return false;
        else return true;
    }
}

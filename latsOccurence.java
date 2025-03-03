import java.util.Scanner;

public class latsOccurence {
    // 1 2 3 6 6 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter isze");
        int a = sc.nextInt();
        int arr[]= new int[a];
        System.out.println("enter elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int target = sc.nextInt();
        int idx =  binarySearch(arr,target);
        System.out.println(idx);

    }

    public static int binarySearch(int arr[],int target){
        int idx =-1;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid] == target) {
                idx = mid;
                low = mid +1 ;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return  idx;
    }
}

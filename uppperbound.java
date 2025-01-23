import java.util.Scanner;

public class uppperbound {
    public static void main(String[] args) {
        System.out.println("Enter array size ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter taget");
        int t = sc.nextInt();
        upperBound(arr,t);
    }
    public static void upperBound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (result != -1) {
            System.out.println("Upper bound index: " + result);
        } else {
            System.out.println("No upper bound found");
        }
    }
}

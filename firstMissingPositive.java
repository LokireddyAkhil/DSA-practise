import java.util.*;
public class firstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int a = sc.nextInt();
        System.out.println("enter array elemnts");
        int arr[]= new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int b = firstMissingPositive(arr);

    }
    // brute force check each number starting from 1 whther it is present or not
    // tc = o(n^2)
    // sc = o(1);
    public static  int firstMissingPositive(int[] arr) {
        // time complexity O(N+ logn + N)   adding elements into hashset , sorting the array,checking whther it is present in the array or not
        // space complexity = O(n)
        HashSet<Integer> nums = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            nums.add(arr[i]);
        }
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int a =0;
        if(max >=1){
            a = max;
        }
        for(int i=1;i<=max;i++){
            if (!nums.contains(i)) {
                return i;

            }
        }
        return a+1;
    }
    public static int firstMissingPositive1(int[] arr) {
        // time complexity o(n)
        // sc = o(1)

        int n = arr.length;
        int a=0;
        while(a<n){
            int ele = arr[a];
            if(arr[a]<=0 || arr[a]==a+1  || arr[a]>n || arr[a]==arr[ele-1]){
                a++;
            }
            else{
                swap(arr,a,ele-1);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1) return i+1;
        }

        return  arr.length+1;
    }
    public static void swap(int arr[], int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

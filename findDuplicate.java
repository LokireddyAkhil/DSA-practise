import java.util.HashSet;
import java.util.Scanner;

public class findDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int a = sc.nextInt();
        System.out.println("enter array elemnts");
        int arr[]= new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int b = findDuplicate(arr);
        int c = findDuplicate1(arr);
        System.out.println(b);
        System.out.println(c);

    }
    public static int findDuplicate2(int[] arr) {
        // using xor operator
    }
    public static int findDuplicate(int[] arr) {
        // you can even use frequncy arry which uses isimilar time and space complexity
        // time complexity o(n)
        // space complexity = 0(n)
        HashSet<Integer> nums = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if (!nums.contains(arr[i])) {
                nums.add(arr[i]);
            }
            else{
                return arr[i];
            }
        }
        return 55;
    }
    public static int findDuplicate1(int[] arr) {
        // using cyclic sort
        // time complexity o(n)
        // space complexity = 0(1)
        int a=0;
        while(true){
            if(arr[a]==a){
                a++;
            }
            else{
                int b = arr[a];
                if(arr[b]==b){
                    break;
                }

                swap(arr,a,arr[a]);
            }
        }
        return arr[a];
    }
    public static void swap(int arr[], int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}



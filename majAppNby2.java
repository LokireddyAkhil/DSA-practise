import java.util.Scanner;
public class majAppNby2 {
    public static void main(String[] args) {
        System.out.println("enter arraysize");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int app = size/2;
        int count =0;
        for (int i = 0; i <arr.length ; i++) {
            int c1 =0;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    c1++;
                }

            }
            if(c1>app) count =arr[i];
        }
        System.out.println(count);
    }
    public static void printarray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


import java.util.Scanner;

public class uniqueElement {
    public static void main(String[] args) {
        System.out.println("enter arraysize");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<size;i++){
            for (int j = i+1; j <size ; j++) {
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }

            }
        }
        for (int i = 0; i <size ; i++) {
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
}

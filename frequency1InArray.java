import java.util.Scanner;

public class frequency1InArray {
    public static void main(String[] args) {
        System.out.print("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size - 1; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] != -1) {
                System.out.println("unique elemnt in the array is " + arr[i]);
            }
        }
    }
}
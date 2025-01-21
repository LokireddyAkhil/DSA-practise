import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class push0ToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        push0s(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void push0s(int arr[]) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] == 0) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    // 2nd method.
    public static void push0ss(int[] arr) {
        ArrayList<Integer> k = new ArrayList<>();
        int nz = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                k.add(arr[i]);
            } else {
                nz++;
            }
        }
        for (int i = 0; i < nz; i++) {
            k.add(0);
        }
        System.out.println(k);

    }

    // 3rd method
    public static void moveZeroes(int[] arr) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return;
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
        return;
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class merge2sortedrr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter arrayelements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter array size");
        int size1 = sc.nextInt();
        int brr[] = new int[size1];
        System.out.println("enter arrayelements");
        for (int i = 0; i < size1; i++) {
            brr[i] = sc.nextInt();
        }
        print1dArray(arr);
        print1dArray(brr);
        int crr[] = mer(arr, brr);
        print1dArray(crr);
    }
    public static void print1dArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static int[] mer(int[] arr, int[] brr) {   // using extra array
        int crr[] = new int[arr.length + brr.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
            } else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }
        while (j < brr.length) {
            crr[k] = brr[j];
            j++;
            k++;
        }
        while (i < arr.length) {
            crr[k] = arr[i];
            i++;
            k++;
        }
        return crr;
    }
    public static ArrayList<Integer> mer1(int[] arr, int[] brr) {   // using extra arraylist
        ArrayList<Integer> crr =new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                crr.add(k,arr[i]);
                i++;
            } else {
                crr.add(k,brr[j]);
                j++;
            }
            k++;
        }
        if (i == arr.length) {
            while (j < brr.length) {
                crr.add(k,brr[j]);
                j++;
                k++;
            }
        }
        if (j == brr.length) {
            while (i < arr.length) {
                crr.add(k,arr[i]);
                i++;
                k++;
            }
        }
        return crr;
    }
    public void merge(int[] arr, int m, int[] brr, int n) { //// without using extraSpace
        int crr[] = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
            } else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }
        while (j < n) {
            crr[k] = brr[j];
            j++;
            k++;
        }
        while (i < m) {
            crr[k] = arr[i];
            i++;
            k++;
        }
        for(int l =0;l<m+n;l++){
            arr[l]=crr[l];
        }
    }
}


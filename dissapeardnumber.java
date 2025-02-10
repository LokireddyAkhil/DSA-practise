import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dissapeardnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int a = sc.nextInt();
        System.out.println("enter array elemnts");
        int arr[]= new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> brr =findDisappearedNumbers(arr);
        System.out.println(brr);
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> brr = new ArrayList();
        int n = arr.length;
        int a=0;
        while(a<n){
            int ele = arr[a];
            if(arr[a]==a+1 || arr[a]==arr[ele-1]){
                a++;
            }
            else{
                swap(arr,a,ele-1);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1) brr.add(i+1);
        }
        return brr;

    }
    public static void swap(int arr[], int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

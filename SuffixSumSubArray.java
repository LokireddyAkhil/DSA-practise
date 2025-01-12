import java.util.Scanner;
public class SuffixSumSubArray {
    public static void main(String[] args) {
        System.out.println("enter arraysize");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int brr[]=arr.clone();
        printarray(arr);
        System.out.println(" ");
        int pref[] = prefix(arr);
        printarray(pref);
        System.out.println(" ");
        int suff[] = Suf(brr);
        printarray(suff);
        System.out.println("enter sum ");
        int sum = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (pref[i] == sum) {
                if (suff[i+1] == pref[i]) {
                    System.out.println("true");
                    break;
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }

    }


    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] Suf(int[] arr){
        reverse(arr);
        int suff[] = prefix(arr);
        reverse(suff);
        return suff;
    }
    public static int [] prefix(int[] arr){
        int p[]= new int[arr.length];
        p[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            p[i]=arr[i]+arr[i-1];
            arr[i]=p[i];
        }
        return p;
    }
    public static void reverse(int[] arr){
        int i=0;
        int j =arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public  static  void swap(int arr[] ,int a,int b){
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
}


//      collegw walllh method
//
//public static int totalsum(int arr[]){
//    int t =0;
//    for(int i=0;i<arr.length;i++){
//        t+=arr[i];
//    }
//    return t;
//}
//
//static boolean equalPartition(int [] arr){
//    int ps =0;
//    int ts= totalsum(arr);
//    for(int i=0;i<arr.length;i++){
//        ps+=arr[i];
//        int ss = ts-ps;
//        if(ss==ps){
//            return true;
//        }
//    }
//    return false;
//}

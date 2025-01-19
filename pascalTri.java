
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class pascalTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
//        int pas[][]= pas(rows);
//        printm(pas);
//        List<List<Integer>> pst = past(rows);
        int pst[][]= past0(rows);
//        System.out.println(pst);
        printm(pst);
    }
    public static void printm(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for (int j =0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    static int[][] pas(int n){
        int pas[][] = new int[n][];
        for (int i = 0; i <n ; i++) {
            pas[i]=new int[i+1];
            pas[i][0]=pas[i][i]=1;
            for (int j = 1; j < i ; j++) {
                pas[i][j]=pas[i-1][j]+pas[i-1][j-1];
            }
        }

        return pas;
    }
    // better
    public static List<List<Integer>> past(int n){
        List<List<Integer>> past = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            List<Integer> l= new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                if(j==0 || j==i) l.add(1);
                else{
                    l.add(past.get(i-1).get(j)+past.get(i-1).get(j-1));
                }
            }
            past.add(l);
        }
        return past;
    }


    public static int[][] past0(int n){
        int arr[][]= new int[n][];
        for(int i=0;i<n;i++){
            arr[i]= new int[i+1];
            for(int j=0;j<=i;j++){
                arr[i][j]= combination(i,j);
            }
        }
        return arr;
    }
    public static int combination(int m, int k) {
        if (k < 0 || m < k) return 0; // Invalid case: return 0 or handle differently
        int n = factorial(m);
        int r = factorial(k);
        int n_r = factorial(m - k);
        return n / (r * n_r);
    }
    public static int factorial(int a) {
        if (a < 0) return 1; // Factorial for negative numbers is undefined; you could throw an exception here.
        int i = 1;
        int f = 1;
        while (i <= a) {
            f *= i;
            i++;
        }
        return f;
    }



}

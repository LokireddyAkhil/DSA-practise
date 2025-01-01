
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class pascalTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
//        int pas[][]= pas(rows);
//        printm(pas);
        List<List<Integer>> pst = past(rows);
        System.out.println(pst);
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



}

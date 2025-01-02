
import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  number of rows");
        int row = sc.nextInt();
        System.out.println("enter  number of col");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("enter elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printarray(arr,row,col);
        int t[][]=tranpose(arr,row,col);
        printarray(t,col,row);
    }
    public static void printarray(int[][]arr,int r,int c){
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    /// in place transform to save memory
    public static void Inpt(int arr[][],int r,int c){
        for (int i = 0; i < c; i++) {
            for (int j = i+1; j <r ; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static int[][] tranpose(int arr[][],int r,int c){
        int t[][]= new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                t[i][j]=arr[j][i];
            }
        }
        return t;
    }

}


import java.util.Scanner;

public class rowHAvMax {
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
        max(arr,row,col);

    }
    public static void max(int[][]arr,int r,int c){
        int rmax =0;
        int rmaxs=0;
        for (int i = 0; i < r; i++) {
            int s=0;
            for (int j = 0; j < c; j++) {
                s+=arr[i][j];
            }
            if(s>rmaxs){
                rmaxs=s;
                rmax=i;
            }
        }
        System.out.println(rmax);
    }
}

import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  number of rows");
        int r = sc.nextInt();
        System.out.println("enter  number of col");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("enter elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter  number of rows of matrix 2");
        int r1 = sc.nextInt();
        System.out.println("enter  number of col of matrix 2 ");
        int c1 = sc.nextInt();
        int brr[][] = new int[r1][c1];
        System.out.println("enter elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                brr[i][j] = sc.nextInt();
            }
        }
        maxmul(arr,r,c,brr,r1,c1);
    }
    public static void maxmul(int arr[][], int r,int c, int brr[][],int r1,int c1){
        int crr[][]= new int[r][c1];
        if(c!=r1){
            System.out.println("matrix mutlipication is not possible");
        }
        else{
            for(int i=0;i<r;i++){
                for(int j =0;j<c1;j++){
                    for(int k =0;k<r1;k++){
                        crr[i][j]+=arr[i][k]*brr[k][j];
                    }
                }
            }
            printarray(crr,r,c1);

        }
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
}

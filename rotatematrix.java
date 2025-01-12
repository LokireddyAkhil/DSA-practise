import java.util.Scanner;

public class rotatematrix {
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
            int brr[][]= transpose(arr);
            reverse2dArrayColumnWise(brr);
            printarray(brr,col,row);

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
    public static int[][] transpose(int [][] arr){
        int m =arr.length;
        int n = arr[0].length;
        int[][] brr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                brr[i][j]=arr[j][i];
            }
        }
        return brr;
    }
    public static void reverse2dArrayColumnWise(int[][] brr){
        for(int i=0;i<brr.length;i++){
            int a = 0;
            int b = brr[i].length-1;
            while(a<b){
               swap(brr[i],a,b);
               a++;
               b--;
            }
        }
    }
    public  static void  swap(int arr[],int a,int b){
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }

}

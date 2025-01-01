
import java.util.Scanner;

public class setmatrixzeros {
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
    public void setZeroes1(int[][] arr) {
        int brr[][]= new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                brr[i][j]=arr[i][j];
            }
        }                                     //brute force.
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(brr[i][j]==0){
                    for(int a=0;a<arr[i].length;a++){
                        arr[i][a]=0;
                    }
                    for(int a=0;a<arr.length;a++){
                        arr[a][j]=0;
                    }
                }
            }
        }

    }
    public void setZeroes(int[][] arr) {
        int []row = new int[arr.length];
        int col[]= new int[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    row[i]++;
                    col[j]++;                // better one;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(row[i]>0 || col[j]>0){
                    arr[i][j]=0;
                }
            }
        }

    }
    public void setZeroes2(int[][] arr) {
        boolean zr =false;
        boolean zc = false;
        for(int i=0;i<arr[0].length;i++){
            if(arr[0][i]==0) {
                zr=true;
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]==0) {          ///optimal one
                zc=true;
                break;
            }
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][0]==0 ||arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }
        if(zr==true){
            for(int i=0;i<arr[0].length;i++){
                arr[0][i]=0;
            }
        }
        if(zc==true){
            for(int i=0;i<arr.length;i++){
                arr[i][0]=0;
            }
        }

    }
}

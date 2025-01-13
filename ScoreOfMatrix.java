import java.util.Scanner;

public class ScoreOfMatrix {
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
        int b = matrixScore(arr);
        System.out.println("the score of matrix is "+b);

    }
        public static int matrixScore(int[][] arr) {
            for(int i=0;i<arr.length;i++){
                if(arr[i][0]==0){
                    swaprows(arr,i);
                }
            }
            for(int j=1;j<arr[0].length;j++){
                int nz=0;int no=0;
                for(int i=0;i<arr.length;i++){
                    if(arr[i][j]==0){
                        nz++;
                    }
                    else no++;
                }
                if(nz>no){
                    swapcol(arr,j);
                }

            }
            int sc=0;
            int fc =1;
            for(int j=arr[0].length-1;j>=0;j--){
                int csc=0;
                for(int i=0;i<arr.length;i++){
                    if(arr[i][j]==1){
                        sc+=arr[i][j]*fc;
                    }
                }
                fc*=2;
            }
            return sc;

        }
        public static  void swaprows(int [][] arr,int m){
            int i=m;
            for(int a=0;a<arr[0].length;a++){
                if(arr[i][a]==0){
                    arr[i][a]=1;
                }
                else{
                    arr[i][a]=0;
                }
            }
        }
        public static void swapcol(int [][] arr,int b){
            int j=b;
            for(int a=0;a<arr.length;a++){
                if(arr[a][j]==0){
                    arr[a][j]=1;
                }
                else{
                    arr[a][j]=0;
                }
            }
        }
    }


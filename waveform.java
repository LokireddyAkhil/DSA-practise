import java.util.Scanner;

public class waveform {
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
        waveform(arr);


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
    public static void waveform(int arr[][]){
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                for(int j=arr[i].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for (int j = 0; j <arr[i].length ; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}

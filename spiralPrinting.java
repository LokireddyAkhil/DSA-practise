package Array.matrix;

import java.util.Scanner;

public class spiralPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows of mat 1");
        int row = sc.nextInt();
        System.out.println("enter columns of mat1");
        int col = sc.nextInt();
        System.out.println("enter elements");
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printm(arr);
        spiralprint(arr,row,col);
    }

    public static void printm(int [][]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    public static void spiralprint(int [][] arr ,int r, int c){
        int topRow=0;
        int rightColumn=c-1;
        int leftColumn=0;
        int bottomRow=r-1;
        int count =0;
        while (count<r*c) {
            for (int i = leftColumn; i <= rightColumn; i++) {
                System.out.print(arr[topRow][i]+" ");
                count++;
            }
            topRow++;
            for (int i = topRow; i <=bottomRow ; i++) {
                System.out.print(arr[i][rightColumn]+" ");
                count++;
            }
            rightColumn--;
            for (int i = rightColumn; i >=leftColumn ; i--) {
                System.out.print(arr[bottomRow][i]+" ");
                count++;
            }
            bottomRow--;
            for (int i = bottomRow; i >=topRow ; i--) {
                System.out.print(arr[i][leftColumn]+" ");
                count++;
            }
            leftColumn++;
        }

    }

}


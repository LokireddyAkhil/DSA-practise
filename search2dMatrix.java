import java.util.Scanner;

public class search2dMatrix {
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
        System.out.println("enter target");
        int target = sc.nextInt();
        boolean k = searchMatrix(arr,target);
        System.out.println(k);
    }
    public  static boolean searchMatrix(int[][] arr, int target) {
        int i=0;int j =(arr[0].length)-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==target) return true;
            else if(arr[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}

import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int r = sc.nextInt();
        System.out.println("enter colum");
        int c = sc.nextInt();
        int ways = maze(1,1,r,c);
        int ways2 = maze2(r,c);
        System.out.println(ways);
        System.out.println(ways2);


    }
    public static int  maze(int a,int b,int r,int c){
        if(a==r || b==c){
            return 1;
        }
        int RightWays = maze(a,b+1,r,c);
        int DownWays= maze(a+1,b,r,c);
        return RightWays+DownWays;
    }
    public static int  maze2(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int RightWays = maze2(r-1,c);
        int DownWays= maze2(r,c-1);
        return RightWays+DownWays;
    }
}

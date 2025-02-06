import java.util.Scanner;

public class StairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        int b = stair(a);
        System.out.println(b);
    }
    public static int stair(int a){
        // the person can jump 1 0r 2 steps at a time.
//        Time Complexity: O(2^a) (exponential due to repeated recursive calls)
//        Space Complexity: O(a) (due to recursion stack depth)
        // even in the case of fibonnaci series the time complexity is same.
        if(a<=2) return a;
        return stair(a-1)+stair(a-2);
    }

}

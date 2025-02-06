import java.util.Scanner;

public class powerOfAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int a =sc.nextInt();
        System.out.println("enter power");
        int b = sc.nextInt();
        int c = pow1(a,b);
        System.out.println(c);

    }
    public static int pow(int a,int b){
        // Time complexity = O(b);
        if(a==0 && b==0 ) return -1;
        if(b==0) return 1;
        return a * pow(a,b-1);
    }
    public static int pow1(int a,int b){
        //Time complexity = O(log b to the base 2)
        if(b==0) return 1;
        int ans = pow(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
}

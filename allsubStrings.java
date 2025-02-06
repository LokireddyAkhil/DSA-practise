
import java.util.Scanner;

public class allsubStrings {
    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String h = sc.next();
        int k =0;
        for (int i = 0; i <h.length() ; i++) {
            for (int j = i+1; j <=h.length() ; j++) {
                System.out.println(h.substring(i,j));

            }

        }
    }
}


import java.util.Scanner;

public class allsubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h = sc.next();
        int k =0;
        for (int i = 0; i <h.length() ; i++) {
            for (int j = i+1; j <h.length() ; j++) {
                System.out.print(h.substring(i,j)+" "+ k);

            }
            System.out.println("");
        }
    }
}

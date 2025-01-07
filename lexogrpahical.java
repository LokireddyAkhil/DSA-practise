
import java.util.Arrays;
import java.util.Scanner;

public class lexogrpahical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newSeq = sc.next();
        String givenword = sc.next();
        String ans = conLex(newSeq,givenword);
        System.out.println(ans);
    }
    public static String conLex(String a,String b){
        char[] ch = a.toCharArray();
        char[] bh = b.toCharArray();
        int qw [] = new int[b.length()];
        for (int i = 0; i <a.length() ; i++) {
            for (int j = 0; j < b.length(); j++) {
                if(bh[j]==ch[i]){
                    qw[j]=i;
                }
            }
        }
        Arrays.sort(qw);
        char []ans = new char[b.length()];
        for (int i = 0; i <b.length() ; i++) {
            ans[i]=ch[qw[i]];
        }
        String fiAns = new String(ans);
        return fiAns;
    }
}

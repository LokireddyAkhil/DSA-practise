import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char ch[]= a.toCharArray();
        compress(ch);
    }
    public  static void compress(char[] arr) {
        StringBuilder sb = new StringBuilder();
        int l=0;
        int i=0;int j=1;
        while(j<arr.length){
            if(arr[i]==arr[j]){
                l++;
                j++;
            }
            else{
                sb.append(arr[i]);
                int len = j-i;
                if(len>1) sb.append(len);
                i=j;
            }
        }
        sb.append(arr[i]);
        int len = j-i;
        if(len>1) sb.append(len);
        System.out.println(sb);

    }
}

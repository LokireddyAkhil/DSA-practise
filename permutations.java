import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String");
       String s = sc.next();
        permutations("",s);

    }
    public static void permutations(String ans,String s){
        // Time complexity = O(n!);
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
       for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           String left = s.substring(0,i);
           String right = s.substring(i+1);
           permutations(ans+ch,left+right);
       }
    }

}
//class Solution {
// may not work for larger test cases
// time complexity is O(n!)"for genrating permutations "+O(m^2)"for genrating substrings"+O(M*N)" for  using retainAll method"
//    public boolean checkInclusion(String s1, String s2) {
//        List<String> sb = new ArrayList<>();
//        List<String> subS = new ArrayList<>();
//        permutation("", s1, sb);
//        generateSubstrings(s2, subS);
//        sb.retainAll(subS);
//        if(sb.isEmpty()) return false;
//        else return true;
//    }
//    public void permutation(String ans, String s, List<String> sb) {
//        if (s.length() == 0) {
//            sb.add(ans);
//            return;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            String left = s.substring(0, i);
//            String right = s.substring(i + 1);
//            permutation(ans + ch, left + right, sb);
//        }
//    }
//    public void generateSubstrings(String s, List<String> subS) {
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j <= s.length(); j++) {
//                subS.add(s.substring(i, j));
//            }
//        }
//    }
//}

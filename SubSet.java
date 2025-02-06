import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String a = sc.nextLine();
        StringSubSet(a,0," ");

    }
    public static void StringSubSet(String s,int i,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        StringSubSet(s,i+1,ans+ch);
        StringSubSet(s,i+1,ans);
    }
    static List<List<Integer>> arr;

    public List<List<Integer>> subsets(int[] nums) {
        // for arrays 
        arr = new ArrayList();
        List<Integer> ans = new ArrayList();
        helper(0, nums, ans);
        return arr;
    }
    public void helper(int i,int nums[],List<Integer> ans){
        if(i==nums.length){
            ArrayList<Integer> list = new ArrayList();
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        helper(i+1,nums,ans);
        ans.add(nums[i]);
        helper(i+1,nums,ans);
        ans.remove(ans.size()-1);
    }

}

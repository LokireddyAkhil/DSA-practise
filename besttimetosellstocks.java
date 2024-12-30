import java.util.Scanner;
public class besttimetosellstocks {
    public static void main(String[] args) {
        System.out.println("enter size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter elements");
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static int stocks (int arr[]){
        int profit=0;

        for(int i=0;i<arr.length;i++){
            int g =0;
            for(int j =i+1;j<arr.length;j++){
                g = arr[j]-arr[i];
                if(g>profit) profit =g;        //brute force
            }
        }
        return profit;
    }
    public static int stocks1 (int arr[]){
        int profit=0;
        int brr[]= new int[arr.length];
        brr[brr.length-1]=arr[brr.length-1];
        int max = arr[brr.length-1];
        for(int i=brr.length-2;i>=0;i--){
            if(max > arr[i]){
                brr[i]=max;
            }                  // using next greates element concept // better one.
            else {
                max = arr[i];
                brr[i]=max;
            }
        }
        for(int i=0;i<arr.length;i++){
            int returns = brr[i]-arr[i];
            if(returns > profit) profit = returns;
        }
        return profit;
    }
    public int maxProfit(int[] arr) {
        int minsofar =arr[0];
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            minsofar = Math.min(minsofar,arr[i]);     //optimal one.
            int profit = arr[i]-minsofar;
            maxprofit= Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}

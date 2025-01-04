import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter array elements");
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int t = sc.nextInt();
//        int brr[] = twoSum(arr,t);
        int crr[] = better(arr,t);
        System.out.println(Arrays.toString(crr));


    }
    public static int[] twoSum(int[] arr, int t) {
        // brute code
        int brr[] = new int[2];
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==t){
                    brr[0]=i;
                    brr[1]=j;
                }
            }
        }
        return brr;
    }
    public static int [] better(int [] arr, int t){
        int [] answer = new int[2];
        int [][] arrWithIndex = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            arrWithIndex[i][0]=arr[i];
            arrWithIndex[i][1]=i;
        }
        Arrays.sort(arrWithIndex, (a, b) -> Integer.compare(a[0], b[0]));
        int left =0;
        int right = arrWithIndex.length-1;
        while(left< right){
            if(arrWithIndex[left][0]+arrWithIndex[right][0]==t){
                answer[0]=arrWithIndex[left][1];
                answer[1]=arrWithIndex[right][1];
                return answer;

            } else if (arrWithIndex[left][0]+arrWithIndex[right][0]<t) {
                left++;
            }
            else {
                right--;
            }
        }
        return answer;
    }
}
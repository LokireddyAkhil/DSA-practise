public class smallestDivisor3shold {
    public static void main(String[] args) {

    }
    public  static int smallestDivisor(int[] arr, int td) { // may not work for some test case
        // time complexity = O(n+O(d*n))
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int  d ;
        for(d=1;d<=max;d++){
            int sum =0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%d==0){
                    sum += arr[i]/d;
                }
                else{
                    sum += arr[i]/d + 1;
                }
            }
            if(sum<=td){
                return d;
            }
        }
        return  d;
    }
}

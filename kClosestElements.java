import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class kClosestElements {
    public static void main(String[] args) {
        int arr[]={10,23,45,67,68,69};
        List<Integer> brr = findClosestElements(arr,3,60);
        System.out.println(Arrays.toString(brr.toArray()));

    }
    public static  List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        if(x>arr[arr.length-1]){
            for(int i=arr.length-1;i>=arr.length-k;i--){
                res.add(arr[i]);
            }
            Collections.sort(res);
            return res;
        }
        if(x<arr[0]){
            for(int i=0;i<k;i++){
                res.add(arr[i]);
            }
            return res;
        }
        int lb = LowerBound(arr,x);
        int i= lb-1;
        int j =lb;
        while(k>0 && i>=0 && j<arr.length){
            int di = Math.abs(x-arr[i]);
            int dj = Math.abs(x-arr[j]);
            if(di<=dj){
                res.add(arr[i]);
                i--;
            }
            else{
                res.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i<0 && k>0){
            res.add(arr[j]);
            j++;
            k--;
        }
        while(j==arr.length && k>0){
            res.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(res);
        return res;
    }
    public static  int  LowerBound(int arr[],int x){
        int lb = arr.length;;
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(arr[mid]>=x){
                lb = Math.min(lb,mid);
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return lb;
    }
//    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    // works only for some cases try to implement it fully in feature.
//        int crr[]= bs(arr,0,arr.length-1,x);
//        int m = crr[0];
//        List<Integer> res = new ArrayList<>();
//        int b =crr[1];
//        if(crr[1]>0){
//            res.add(arr[b]);
//
//            while(k>0){
//                int f =1;
//                res.add(arr[b-f]);
//                k--;
//                if(k>0){
//                    res.add(arr[b+f]);
//                    k--;
//                }
//                f++;
//            }
//            Collections.sort(res);
//            return res;
//
//        }else{
//
//            while(k>0){
//                int g =1;
//                res.add(arr[m]);
//                k--;
//
//                if(k>0){
//                    res.add(arr[m+g]);
//                    k--;
//                }
//                g++;
//            }
//            Collections.sort(res);
//            return res;
//        }
//    }
//    public int[] bs(int arr[],int low,int high,int x){
//        int brr[] = new int[2];
//        while(low<=high){
//            int mid = low + (high-low)/2;
//            if(arr[mid]==x){
//                brr[1]=mid;
//            } else if (arr[mid]>x) {
//                high=mid-1;
//            }
//            else{
//                low=mid+1;
//            }
//        }
//        brr[0]=high;
//        return brr;
//    }
}

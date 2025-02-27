import java.util.Arrays;
import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        print(arr);
        int a = majorityElement(arr);
        int b = majorityElement1(arr);
        int c = majorityElement2(arr);
        System.out.println(a+" "+b+" "+c);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static int majorityElement(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
    public static int majorityElement1(int arr[]){
        int maj = arr.length/2;
        for(int i=0;i<arr.length;i++){
            int c1=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c1++;
                }
            }
            if(c1>maj){
               return arr[i];
            }
        }
        return -1;
    }
    public static int majorityElement2(int arr[]){
        // Boyer-Moore Majority Voting Algorithm
        /*The Boyer-Moore voting algorithm is one of the popular optimal algorithms
         which is used to find the majority element among the given elements that have more
         than N/ 2 occurrences. This works perfectly fine for finding the majority element which
         takes 2 traversals over the given elements, which works in O(N) time complexity and O(1)
         space complexity.*/
        /*
        When the elements are the same as the candidate element, votes are incremented
        whereas when some other element is found (not equal to the candidate element),
        we decreased the count. This actually means that we are decreasing the priority
        of winning ability of the selected candidate, since we know that if the candidate
        is in majority it occurs more than N/2 times and the remaining elements are less
        than N/2. We keep decreasing the votes since we found some different element(s)
         than the candidate element. When votes become 0, this actually means that there
         are the equal  number of votes for different elements, which should not be the case
         for the element to be the majority element. So the candidate element cannot be the
         majority and hence we choose the present element as the candidate and continue the
         same till all the elements get finished. The final candidate would be our majority
         element. We check using the 2nd traversal to see whether its count is greater than N/2.
         If it is true, we consider it as the majority element.
         */
        int currentElement =0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(count ==0){
                
                currentElement=arr[i];
            }
            if(currentElement==arr[i]){
                count++;
            } else {
                count--;
            }
        }
        return currentElement;
    }
}

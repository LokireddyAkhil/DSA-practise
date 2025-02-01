public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,10};
        int a = searchInsert(arr,2);
        int b = searchInsert1(arr,2);
        System.out.println(a);
        System.out.println(b);
    }
    public static int searchInsert(int[] nums, int target) {
         for (int i = 0; i < nums.length; i++) {
             if (nums[i] >= target) {
                 return i;
             }
         }
         return nums.length;
     }
    public static int searchInsert1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}

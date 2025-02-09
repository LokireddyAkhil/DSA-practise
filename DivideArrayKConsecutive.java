import java.util.TreeMap;

public class DivideArrayKConsecutive {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) return false;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (count > 0) { // Try to form sets
                for (int i = 0; i < k; i++) {
                    int nextKey = key + i;
                    if (map.getOrDefault(nextKey, 0) < count) return false;
                    map.put(nextKey, map.get(nextKey) - count);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        DivideArrayKConsecutive solution = new DivideArrayKConsecutive();
        System.out.println(solution.isPossibleDivide(new int[]{1,2,3,3,4,4,5,6}, 4)); // true
        System.out.println(solution.isPossibleDivide(new int[]{3,3,2,2,1,1}, 3)); // true
        System.out.println(solution.isPossibleDivide(new int[]{1,2,3,4}, 3)); // false
    }
}
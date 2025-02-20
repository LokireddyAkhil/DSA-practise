public class SpiralSingleLinkedList {
    public  static int[][] spiralMatrix(int m, int n, Node head) {
        // leetcode 2326 .
        Node temp = head; int a = 0;int b = 0;
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = -1;
            }
        }
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while (temp != null) {
            for (int i = left; i <= right && temp != null; i++) {
                arr[top][i] = temp.val; temp = temp.next;
            }
            top++;
            for (int i = top; i <= bottom && temp != null; i++) {
                arr[i][right] = temp.val; temp = temp.next;
            }
            right--;
            for (int i = right; i >= left && temp != null; i--) {
                arr[bottom][i] = temp.val; temp = temp.next;
            }
            bottom--;
            for (int i = bottom; i >= top && temp != null; i--) {
                arr[i][left] = temp.val; temp = temp.next;
            }
            left++;
        }
        return arr;
    }
}

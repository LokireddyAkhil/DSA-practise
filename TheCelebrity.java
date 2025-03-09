import java.util.Stack;

public class TheCelebrity {
    public static  int celebrity(int arr[][]) {
        // t.c = 0(n^2) // s.c = 0(n)
        int KnowMe[]= new int[arr.length];int Iknow[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1){
                    KnowMe[j]++;
                    Iknow[i]++;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(KnowMe[i]==arr.length-1 && Iknow[i]==0){
                return i;
            }
        }
        return -1;
    }
    public  static int celebrity1(int arr[][]) {
        // t.c = o(n)// s.c = 0(1)
       int top = 0;
       int down = arr.length-1;
       while(top<down){
           if(arr[top][down]==1){
               top++;
           }
           else if (arr[down][top]==1){
               down--;
           }
           else{
               top++;
               down--;
           }
       }
       if(top>down) return -1;
       for(int i=0;i<arr.length;i++){
           if(i==top) continue;
           if(arr[top][i]==0 && arr[i][top]==1){
           }
           else{
               return -1;
           }
       }
       return top;
    }
    public int findCelebrity(int[][] arr) {
        // t.c = 0(n)// s.c = o(1)
        int n = arr.length;
        int candidate = 0;

        for (int i = 1; i < n; i++) {
            if (arr[candidate][i] == 1) {
                candidate = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != candidate && (arr[candidate][i] == 1 || arr[i][candidate] == 0)) {
                return -1;
            }
        }
        return candidate;
    }
    public int findCelebrity1(int[][] arr) {
        // t.c = o(n); // s.c = o(n);
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int A = stack.pop();
            int B = stack.pop();
            if (arr[A][B] == 1) {
                stack.push(B);
            }
            else {
                stack.push(A);
            }
        }
        if (stack.isEmpty()) return -1;
        int candidate = stack.pop();
        for (int i = 0; i < n; i++) {
            if (i != candidate && (arr[candidate][i] == 1 || arr[i][candidate] == 0)) {
                return -1;
            }
        }
        return candidate;
    }

}

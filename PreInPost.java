public class PreInPost {
    public static void main(String[] args) {
        //predict the output without running it .
        pip(3);
    }
    public static void pip(int a){
        //we can print the zigzag pattern using this
        if(a==0) return;
        System.out.print(a+" "); // thw work before 2 calls called prework
        pip(a-1);
        System.out.print(a+" "); // the work in between 2 callls is known as in work
        pip(a-1);
        System.out.print(a+" ");// thw work after 2 calls is known as postwork

    }
}

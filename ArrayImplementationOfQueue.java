public class ArrayImplementationOfQueue {
    public static void main(String[] args) {
        queueA qw = new queueA();
        qw.add(1);qw.add(2);qw.add(3);
        qw.add(4);qw.display();qw.remove();qw.display();
    }
    public static class queueA{
        int f =-1;
        int r = -1;
        int size =0;
        int arr[]= new int[100];
        public void add(int a){
            if(r==arr.length-1) System.out.println("queue is full");
            if(f==-1 ){
                f=r=0;
                arr[0]=a;
            }
            else{
                arr[++r]=a;
            }
            size++;
        }
        public int remove(){
            if(size==0){ System.out.println("queue is empty"); return -1;}
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            return arr[f];
        }
        public void display(){
            if(size==0) return;
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }
}

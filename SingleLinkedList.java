class Node{
    int val ;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class SLL{
    Node head ;
    Node tail ;
    int size =0;
    void InsertAtLast(int val){
        Node temp = new Node (val);
        if(head == null ){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void InsertAtHead(int val){
        Node temp = new Node (val);
        if(head == null ){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void display( ){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");

            temp = temp.next;
        }
        System.out.println();
    }
    void insert(int idx,int a){
        if(idx==0){
            InsertAtHead(a);
            return;
        }
        if(idx==size){
            InsertAtLast(a);
            return;
        }
        if(idx>size){
            System.out.println("invalid index");
            return;
        }


        Node temp = new Node(a);
        Node x = head;
        for(int i=0;i<idx;i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next =temp;

        size++;

    }
    int get(int idx){
        if(idx>=size|| idx<0){
            System.out.println("invalid index");
            return -1;
        }
        if(idx==size-1){
            return tail.val;
        }
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx,int val){
        if(idx>=size|| idx<0){
            System.out.println("invalid index");

        }
        if(idx==size-1){
             tail.val = val;
        }
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteAthead(){
        if(head == null ){
            System.out.println("list is empty");
        }
        head = head.next;
        size--;
    }
    void deleteAtIndex(int idx){
        if(head == null ){
            System.out.println("list is empty");
        }
        if(idx<0 || idx> size) System.out.println("invalid index");
        Node temp = head;
       for(int i=1;i<=idx-1;i++){
           temp = temp.next;
       }
       if(temp.next==tail) tail = temp;
       temp.next= temp.next.next;
        size--;
    }
}

public class SingleLinkedList {
    public static void main(String[] args) {
//        Node a = new Node(20);
//        Node b = new Node(40);
//        Node c = new Node(50);
//        Node d = new Node(60);
//        Node e = new Node(70);
//        a.next=b;b.next=c;c.next=d;d.next=e;
//        display(a);
//        displayRecursively(a);
        SLL list = new SLL();
        list.InsertAtLast(10);
        list.InsertAtLast(20);
      //  list.display(); // 10 20
//        System.out.println(list.size);
        list.InsertAtHead(100);
      //  list.display(); // 100 10 20
        list.insert(1,1000);
        list.display();
        System.out.println(list.get(3));
        list.set(2,999);;
        list.display();
        list.deleteAthead();
        list.deleteAtIndex(1);
        list.display();

    }
    public static void display(Node a ){
        Node temp = a;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }public static void displayRecursively(Node a ){
        if(a==null) return;
        System.out.println(a.val);
        displayRecursively(a.next);
    }


}

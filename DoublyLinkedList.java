class DNode {
    int val;
    DNode next;
    DNode prev;
    public DNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList {
    public static DNode head = null;
    public static DNode tail = null;
    public static int size = 0;
    public static void insertAtEnd(int val) {
        DNode newNode = new DNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public static void insertAtFirst(int val) {
        DNode newNode = new DNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public static void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) { // Only one node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    public static void deleteLast() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) { // Only one node
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
     public static void deleteByValue(int val) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        DNode temp = head;
        while (temp != null && temp.val != val) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found in the list.");
            return;
        }

        if (temp == head) {
            deleteFirst();
        } else if (temp == tail) {
            deleteLast();
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
        }
    }
    public static void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        DNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static boolean isEmpty() {
        return head == null;
    }
    public static int size() {
        return size;
    }
    public static void main(String[] args) {
        DoublyLinkedList.insertAtEnd(10);
        DoublyLinkedList.insertAtEnd(20);
        DoublyLinkedList.insertAtEnd(30);
        DoublyLinkedList.insertAtFirst(5);
        DoublyLinkedList.insertAtFirst(1);
        System.out.println("List (Forward):");
        DoublyLinkedList.displayForward();
        System.out.println("List (Backward):");
        DoublyLinkedList.displayBackward();
        System.out.println("Deleting first element...");
        DoublyLinkedList.deleteFirst();
        DoublyLinkedList.displayForward();
        System.out.println("Deleting last element...");
        DoublyLinkedList.deleteLast();
        DoublyLinkedList.displayForward();
        System.out.println("Deleting value 10...");
        DoublyLinkedList.deleteByValue(10);
        DoublyLinkedList.displayForward();
        System.out.println("Size of list: " + DoublyLinkedList.size());
        System.out.println("Is list empty? " + DoublyLinkedList.isEmpty());
    }
}

public class designLinkedList {
    // leetcode 707
    class MyLinkedList {
        class Node {
            int val;
            Node prev, next;

            Node(int val) {
                this.val = val;
            }
        }

        private Node head, tail;
        private int size;

        public MyLinkedList() {
            head = new Node(0);  // Dummy head
            tail = new Node(0);  // Dummy tail
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        public int get(int index) {
            if (index < 0 || index >= size) return -1;
            Node curr = getNode(index);
            return curr.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size) return;

            Node prev = index == 0 ? head : getNode(index - 1);
            Node next = prev.next;

            Node newNode = new Node(val);
            prev.next = newNode;
            newNode.prev = prev;
            newNode.next = next;
            next.prev = newNode;

            size++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;

            Node toDelete = getNode(index);
            Node prev = toDelete.prev;
            Node next = toDelete.next;

            prev.next = next;
            next.prev = prev;

            size--;
        }

        private Node getNode(int index) {
            Node curr;
            if (index < size / 2) {
                curr = head.next;
                for (int i = 0; i < index; i++) {
                    curr = curr.next;
                }
            } else {
                curr = tail.prev;
                for (int i = size - 1; i > index; i--) {
                    curr = curr.prev;
                }
            }
            return curr;
        }
    }

}

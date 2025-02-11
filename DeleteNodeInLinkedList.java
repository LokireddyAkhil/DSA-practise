public class DeleteNodeInLinkedList {
    // leetcode 237
    
    public static void deleteNode(Node node) {
        node.val = node.next.val;
        node.next=node.next.next;
        return;

    }
}

package LinkedList;

public class MiddleLinkedList {
    public static Node Middle(Node head) {
        if (head == null || head.next == null)
            return head;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {

    }
}

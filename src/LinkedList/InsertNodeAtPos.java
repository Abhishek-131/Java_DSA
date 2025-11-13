package LinkedList;


public class InsertNodeAtPos {

    public static void main(String[] args) {
        Node head = new Node(2);
        Node node1 = new Node(3);
        Node node2 = new Node(4);
        Node node3 = new Node(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

    }
}

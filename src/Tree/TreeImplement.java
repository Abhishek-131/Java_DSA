package Tree;

public class TreeImplement {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);


        System.out.println(root.data);
    }
}






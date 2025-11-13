package Tree;

import java.util.ArrayList;
import java.util.List;

public class InOrder {
    static List<Integer> inorder = new ArrayList<>();
    static List<Integer> inOrderTraversal(Node root){
        if(root == null){
            return inorder;
        }

        inOrderTraversal(root.left);
        inorder.add(root.data);
        inOrderTraversal(root.right);
        return inorder;
    }

    public static void main(String[] args) {

        //Creating sample a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> ans = inOrderTraversal(root);

        //inorder traversal result
        for(int val : ans){
            System.out.print(val+ "->");
        }
    }
}

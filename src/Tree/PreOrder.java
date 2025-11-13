package Tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {

    static List<Integer> pre = new ArrayList<>();
     static List<Integer> preOrderTraversal(Node root){
        if(root == null){
            return pre;
        }
        pre.add(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        return pre;
     }

    public static void main(String[] args) {
        //Creating a simple Binary Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

       List<Integer> ans = preOrderTraversal(root);

       //
       for(int val : ans){
           System.out.print(val+ " ");
       }
    }
}

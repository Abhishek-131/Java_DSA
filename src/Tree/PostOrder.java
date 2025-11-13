package Tree;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {

    static List<Integer> postorder = new ArrayList<>();
    static List<Integer> postOrderTraversal(Node root){
        // No element the return the list..
       if(root == null){
           return postorder;
       }

       postOrderTraversal(root.left);   //Goto the left root
       postOrderTraversal(root.right);  // Goto the right root
       postorder.add(root.data);            // Add the data into list

        return postorder;
    }
    public static void main(String[] args) {
        //Creating tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> ans = postOrderTraversal(root);

        //Iterate the tree
        for(int val : ans){
            System.out.print(val +"->");
        }
    }
}

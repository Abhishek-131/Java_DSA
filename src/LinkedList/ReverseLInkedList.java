package LinkedList;

import java.util.Stack;

public class ReverseLInkedList {
    private static Node ReverseLLUsingStack(Node head){
        if(head == null || head.next == null) return null;

        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null){
            temp.data = stack.pop();
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = ArrayToLL.Array2LL(arr);

        head = ReverseLLUsingStack(head);
        ArrayToLL.Print(head);
    }
}

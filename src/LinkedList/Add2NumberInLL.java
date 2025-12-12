package LinkedList;

public class Add2NumberInLL {

//    private static Node AddTwoNumbers(Node head1, Node head2){
//        Node dummyNode = new Node(-1);
//        Node curr = dummyNode;
//        Node temp1 = head1;
//        Node temp2 = head2;
//        int carry = 0;
//        while (temp1 != null || temp2 != null){
//            int sum = carry;
//            if(temp1 != null){
//                sum = sum + temp1.data;
//            }
//            if (temp2 != null) sum = sum + temp2.data;
//            Node newNode = new Node(sum%10);
//            carry = sum /10;
//
//            curr.next = newNode;
//            curr = curr.next;
//
//            if(temp1!=null) temp1 = temp1.next;
//            if(temp2!=null) temp2 = temp2.next;
//        }
//        if(carry){
//            Node newNode = new Node(carry);
//            curr.next = newNode;
//        }
//        return dummyNode.next;
//    }

    public static void main(String[] args) {
    int[] arr = {3,6,8,9,0};
    int[] arr1 = {12,23,34};
    Node head1 = ArrayToLL.Array2LL(arr);
    Node head2 = ArrayToLL.Array2LL(arr1);

    }
}

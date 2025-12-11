package LinkedList;


public class ArrayToLL {
    //Array To LinkedList
    public static Node Array2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void Print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    //Check if Element present
    private static int CheckElement(Node head, int val){
        Node temp = head;
        while (temp != null){
            if(temp.data == val)
                return val;
            temp = temp.next;
        }
        return -1;
    }

    public static void main(String[] args) {
       int arr[] = {2,5,6,8};
        Node head = Array2LL(arr);
//        Print(head);

        int val = CheckElement(head, 5);
        System.out.println(val);

    }
}

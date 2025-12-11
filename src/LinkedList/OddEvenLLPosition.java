package LinkedList;

public class OddEvenLLPosition {
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

    //Print the LL
    private static void Print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    private static Node OddEven(Node head){
        if(head == null || head.next == null) return head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;
        while (even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = Array2LL(arr);
        head = OddEven(head);
        Print(head);
    }
}

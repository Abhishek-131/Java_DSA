package LinkedList;

public class DeleteLL {
//Array To LL
    private static Node Array2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    //Print the Node
    private static void Print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    //Delete the Head of the LL
    private static Node removeHead(Node head){
       if(head == null) return head;
        head = head.next;
        return head;
    }

    //Delete the Tail of the LL
    private static Node removeTail(Node head){
        //if there is none or one element remove this
        if(head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // remove kth Element and Last Element
    private static Node removeK(Node head,int pos){
        if(head == null) return head;
        //if Remove First Element
        if(pos == 1){
            head = head.next;
            return head;
        }
        int counter = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null){
            counter++;
            if(counter == pos){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return  head;
    }

    //Remove Element
    private static Node removeElement(Node head,int val){
        if(head == null) return head;
        //if Remove First Element
        if(head.data == val){
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null){
            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return  head;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        Node head = Array2LL(arr);
//        head = removeHead(head);
//        head = removeTail(head);
//        head = removeK(head, 3);
        head = removeElement(head,5);
        Print(head);


    }
}

package LinkedList;

public class InsertLL {
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

    //Insert At the Head
    private static Node InsertHead(Node head,int val){
       if(head == null) return new Node(val);
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    //Insert At the Tail
    private static Node InsetTail(Node head,int val){
        if(head == null) return new Node(val);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    //Insert At the Kth position
    private static Node InsertKthPos(Node head,int ele, int pos){
    // if the Node have 0 element
        if(head == null) {
            if(pos == 1){
                return new Node(ele);
            }else{
                return head;
            }
        }
        //If the position is 1
        if(pos == 1){
            return new Node(ele,head);
        }

        int cnt = 0;
        Node temp = head;
        while (temp != null){
            cnt++;
            if(cnt == pos-1){
                Node newNode = new Node(ele);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    //Insert element before element
    private static Node InsertBeforeValue(Node head,int ele, int val){
        // if the Node have 0 element
        if(head == null) {
            return null;
        }
        //If the value is headValue
        if(head.data == val){
            Node newNode = new Node(ele);
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        while (temp.next != null){
            if(temp.next.data == val){
                Node newNode = new Node(ele);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }


    public static void main(String[] args) {
        int arr[] = {12,3,4,5};
        Node head = Array2LL(arr);
//        head = InsertHead(head,56);
//        head = InsetTail(head,45);
//        head = InsertKthPos(head,9,5);
        head = InsertBeforeValue(head,100,12);
        Print(head);

    }
}

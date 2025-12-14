package LinkedList;

public class DeleteMiddleNode {
    //Brute Force
    // 1. Count the Length of the LL and Divide by 2
    // 2. And then Change the Link of the LinkedList
    // TC : o(n) + o(n/2) , SC : O
    //edge case : if LL null or contain 1 LL return null

    private static Node DeleteMidNode(Node head){
    if(head == null || head.next == null) return null;
        int cnt = 0;
        Node temp = head;
        while (temp != null){
            cnt++;
            temp = temp.next;
        }
        int mid = cnt/2;
        temp = head;
        for (int i = 0; i <mid ; i++) {
            mid--;
            if(mid == 0) break;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }


    //Optimize :
    // 1. Base case if LL contain none or 1 element it return null
    // 2. Using slow and fast pointer
    // 3. slow move one-step ,fast move two-step
    // 4. first time we skip the slow pointer to move so that we stay one step before middle element
    // 5 . And then change the link and return the head;
    private static Node DeleteMidNodeOptimize(Node head){

        if(head == null || head.next == null) return null;
        Node slow = head, fast = head;
        fast = fast.next.next;

        while (fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
         Node head = ArrayToLL.Array2LL(arr);
         head = DeleteMidNode(head);
//        head = DeleteMidNodeOptimize(head);
         ArrayToLL.Print(head);

    }
}

package LinkedList;

public class RemoveNthFromEnd {
    //Brute Force
    private static Node RemoveNthNodeFronEnd(Node head, int n){
        int cnt = 0;
        Node temp = head;
        //First Count the Size of the
        while (temp != null){
            cnt++;
            temp= temp.next;
        }
        //Edge case if the count == N then change the head
        if(cnt == n){
            Node newNode = head.next;
            return newNode;
        }
        int res = cnt - n;
        temp = head;
        while (temp != null){
           res--;
           if(res == 0) break;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    // Better Using Slow and Fast Pointer
    private static Node RemoveNthNodeOptmize(Node head,int N){
        Node slow = head, fast = head;
        for (int i = 0; i < N; i++) {
            fast = fast.next;
        }
        //If the N is equal to the total length of the LL then its mean head will be removed
        if(fast.next == null ) return head.next;
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int N = 4;
        Node head = ArrayToLL.Array2LL(arr);
//        head  = RemoveNthNodeFronEnd(head,N);
        head = RemoveNthNodeOptmize(head,N);
        ArrayToLL.Print(head);
    }
}

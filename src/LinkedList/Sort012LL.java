package LinkedList;

public class Sort012LL {
    //Brute Force: First count the value of 0,1 and 2
    // then place the value in the node TC:o(2N) ,SC: O(N)
    private static Node SortElement(Node head){
        //edge case if is haven't element || have one element
        if(head == null || head.next == null) return  head;

        int count0 = 0, count1=0, count2=0;
        Node temp = head;
        //Count the value of the 0,1 and 2
        while (temp != null){
            if(temp.data == 0) count0++;
            else if(temp.data == 1) count1++;
            else if(temp.data == 2) count2++;
            temp = temp.next;
        }

        // Place the 0 on Node till and decrease the count0 and move the temp to next
        temp = head;
        while (temp != null){
            if(count0>0){
                temp.data = 0;
                count0--;
            } else if (count1>0) {
                temp.data = 1;
                count1--;
            } else{
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }
        return head;
    }

//Optimize Code use :::: three dummyNode
    private static Node SortElementOptimize(Node head){
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;
        Node temp = head;

        while (temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next= temp;
                one = one.next;
            }else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        if(oneHead.next != null){
            zero.next = oneHead.next;
        }else {
            zero.next = twoHead.next;
        }

        one.next = twoHead.next;
        two.next = null;

        Node newNode = zeroHead.next;

        return newNode;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,2,0,2,1};
        Node head = ArrayToLL.Array2LL(arr);
//        head = SortElement(head);
        head = SortElementOptimize(head);
        ArrayToLL.Print(head);
    }
}

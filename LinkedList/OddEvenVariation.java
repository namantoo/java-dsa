//  Problem: Group nodes by odd and even values (could be considered a followup post 328. Odd Even Linked List )

public class OddEvenVariation {


    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode groupOddEvenValues(ListNode head){
        if(head == null){
            return null;
        }
        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;

        ListNode curr = head;

        while(curr != null){
            if(curr.val % 2 != 0){
                if(oddHead == null){
                    oddHead = oddTail = curr;
                } else{
                    oddTail.next = curr;
                    oddTail = curr;
                }
            }else{
                if(evenHead == null){
                    evenHead = evenTail = curr;
                }else{
                    evenTail.next = curr;
                    evenTail = curr;
                }
            }
            curr = curr.next;
        }
        if(oddTail != null){
            oddTail.next = evenHead;
        }

        if(evenTail != null){
            evenTail.next = null;
        }
        return (oddHead != null) ? oddHead : evenHead;
    }
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(7);
        System.out.println("Original List:");
        printList(head);
        System.out.println("");

        ListNode newHead = groupOddEvenValues(head);
        printList(newHead);

        // printList(head);
    }
}

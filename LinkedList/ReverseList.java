public class ReverseList {
    

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode reverseList(ListNode head){
      
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }



    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(7);
        System.out.println("Original List:");
        printList(head);
        System.out.println("");
        System.out.println("Reversed");
        head = reverseList(head);
        printList(head);

        // printList(head);
    }
}

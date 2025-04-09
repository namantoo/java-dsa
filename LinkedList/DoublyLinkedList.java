public class DoublyLinkedList {

    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }

   
    public static void display(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + " " );
            temp = temp.next;
        }
        System.out.println();
    } 
    public static void displayTail(Node tail){

        Node temp = tail;

        while(temp != null){
            System.out.print(temp.val + " " );
            temp = temp.prev;
        }
        System.out.println();
    } 
    public static void displayRandom(Node random){
        Node temp = random;

        while(temp.prev != null){
            temp = temp.prev;
          
        }
        while(temp.next != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print("");
    }
    

    public static void main(String[] args) {
        // 4 5 6 7 8
        Node a = new Node(4);
        Node b  =  new Node(5);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(8);

        a.prev= null;
        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        d.prev=  c;
        d.next = e;

        e.prev = d;
        e.next = null;

        display(a);
        displayTail(e);
        displayRandom(c);
        
    }
}

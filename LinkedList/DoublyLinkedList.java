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
   public static Node insertAtHead(Node head, int x){
    Node t = new Node(x);

    t.next = head;
    head.prev = t;
    head = t;

    return head;


   }
   public static Node insertAtIndex(Node head, int idx, int x) {
    Node newNode = new Node(x);

    // Inserting at head (index 0)
    if (idx == 0) {
        newNode.next = head;
        if (head != null) head.prev = newNode;
        return newNode;
    }

    Node temp = head;
    for (int i = 0; i < idx - 1 && temp != null; i++) {
        temp = temp.next;
    }

    if (temp == null || temp.next == null) {
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    newNode.next = temp.next;
    temp.next.prev = newNode;
    temp.next = newNode;
    newNode.prev = temp;

    return head;
}

   public static void insertAtTail(Node head, int x){
    
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        Node t= new Node(x);

        temp.next = t;
        t.prev = temp;

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
        // displayRandom(c);
        
        Node newHead = insertAtHead(a, 45);
        display(newHead);
        insertAtTail(a, 90);
        display(a);
        insertAtIndex(a, 3, 342);
        display(a);

    }
}

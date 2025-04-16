
public class DeleteLinkedList {
    public static void display(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
        System.out.println("Count: " + count);
    }
    //recursion print
    public static void displayr(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        displayr(head.next); 

    }

    
    public static void displayrr(Node head){
        if(head == null){
            return ;
        }
       
        displayrr(head.next); 
        System.out.print(head.data + " ");
        

    }

    //email add
    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

        }

    public static void main(String[] args) {
        Node a = new Node(5);
        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node temp = a;
        a.next = b;
        b.next = c;
        c.next = d;
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(c.data);
        display(a);
        displayr(a);
        System.out.println();
        displayrr(a);
     
        
    }
}
 

public class DeleteLinkedList {
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
       
        
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
     
        
    }
}

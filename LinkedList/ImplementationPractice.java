

public class ImplementationPractice {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{

        Node head = null;
        Node tail = null;

        void insertAt(int index, int data){
            Node t = new Node(data);
            Node temp = head;
            if(index == size()){
                insertAtEnd(data);
            }else if(index == 0){
                insertAtBeginning(data);
            }else if(size() < 0 || index > size()){
                System.out.println("index outta range");
            }
            for(int i = 1; i < index ; i++ ){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;


        }
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;

        }
        void insertAtBeginning(int data){
            Node temp = new Node(data);

            if(head == null){
               insertAtEnd(data);
            }else{
                temp.next = head;
                head = temp;
            }
            

        }
     
        void display(){
            Node temp = head;
            while( temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
           }

    }
    public static void main(String[] args){
        
        linkedlist ll = new linkedlist();

        ll.insertAtBeginning(5); 
        ll.insertAtEnd(6); 
        ll.insertAt(1,2);


        ll.display();


    }


    
}

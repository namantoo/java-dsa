// package LinkedList;

public class Implementation {
    
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

       void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null ){
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
       void insertAt(int index, int data){
        Node t = new Node(data);
        Node temp = head;
        if(index == size()){
            insertAtEnd(data);
            return;
        }else if(index == 0){
            insertAtBeginning(data);
            return;
        }else if(index < 0 || index > size()){
            System.out.println("wrong index");

        }

        for(int i = 1; i <= index - 1; i++){
            temp = temp.next;

        }
        t.next = temp.next;
        temp.next = t;
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
       int getAt(int index){
        Node temp = head;
        for(int i = 1; i <= index; i++){
            temp = temp.next;
        }
        return temp.data;
       }
       void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp =  temp.next; 
        }
       }
      

    }



    public static void main(String[] args){
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(2);

        ll.insertAtBeginning(6);

        ll.display();
        System.out.println();
       System.out.println( ll.size());
       System.out.println();
  
    // ll.insertAt(, 999);
    ll.display();
    System.out.println();
        System.out.println(ll.head.data);
   
        System.out.println(ll.tail.data);
        System.out.println(ll.getAt(2));


    }
}

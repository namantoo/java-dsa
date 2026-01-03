// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
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
        void insertAtEnd(int val){
               Node temp = new Node(val);
               if(head == null){
                   head = temp;
                
               }else{
               tail.next = temp;
              
               }
               tail = temp;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
                
            }
        }
        void insertAtBetween(int index, int val){
            Node newNode = new Node(val);
            Node temp = head;
            if(index == size()){
                insertAtEnd(val);
                return;
            }
            if(index == 0){
                insertAtHead(val);
                return;
            }
            if(index < 0 || index > size()){
                System.out.println("wrong index");
                return;
            }
            for(int i = 1; i <= index-1; i++){
                 temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
          }
        int getAt(int index){
            Node temp = head;
             if(index < 0 || index > size()){
                System.out.println("wrong index");
                return;
            }
            for(int i = 1; i <= index; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ " -> ");
                temp = temp.next;
            }
              System.out.println();
        }
        int size(){
            int count = 0;
            Node temp = head;
            while(temp != null){
                count++;    
                
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.display();
      
         System.out.println(ll.size());
         ll.insertAtEnd(8);
           ll.insertAtHead(45);
         ll.display();
       
         ll.insertAtBetween(-2,2323);
         ll.display();
          System.out.println(ll.head.next.data);
             System.out.println(ll.getAt(3));
       
    }
} 

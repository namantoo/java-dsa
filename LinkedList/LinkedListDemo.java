public class LinkedListDemo {
    // Step 1: Node class (each node has data and a pointer to the next node)
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // Step 2: LinkedList class (stores multiple nodes)
    static class LinkedList {
        Node head;

        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        public void deleteByValue(int data) {
            if (head == null) return;
            if (head.data == data) {
                head = head.next;
                return;
            }
            Node current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }
         
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    // Step 3: Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        System.out.println("Linked List after inserting at beginning:");
        list.printList();

        list.insertAtEnd(40);
        System.out.println("\nLinked List after inserting 40 at the end:");
        list.printList();

        list.deleteByValue(20);
        System.out.println("\nLinked List after deleting node with value 20:");
        list.printList();
    }
}

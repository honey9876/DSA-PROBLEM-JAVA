package LinkedList;

public class LinkedList {
    
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; 
    private Node tail; 


    public LinkedList() {
        head = null;
        tail = null;
    }


    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode; 
    }

   
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
      
    public void print(){
        if (head == null) {
            System.out.println("LL is empty");
            
        }
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2); 
        ll.addFirst(1);
        ll.addLast(3);  
        ll.addLast(4);  

        ll.printList(); 
    }
}

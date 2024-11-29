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
    // public static Node size;


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
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while( i < idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        // if (size == 0) {
        //     System.out.println("ll is empty");
        // }
        int val = head.data;
        head = head.next;
        return val;

    }
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }



    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.print();
        ll.addFirst(2); 
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3);  
        // ll.print();
        ll.addLast(4);  
        ll.add(2, 3);
        // ll.print();

        // ll.printList(); 
        // ll.removeFirst();
        ll.print();
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));

    }
}

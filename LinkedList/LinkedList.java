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
    public static Node size;


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
        if (size == 0) {
            System.out.println("ll is empty");
        }
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

    public void revers(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            
        }
        head = prev;

    }
    public void deleteNthfromEnd(int n ){
        int size = 0;
        Node temp = head;
        while (temp !=null) {
            temp = temp.next;
            size++;
            
        }
        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = size-n;
        Node prev = head;
        while (i < iToFind) {
           prev = prev.next;
           i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    public boolean Checkpalindrome(){ 
        if (head == null || head.next == null) {
            return true;

        }
        Node midNode = findMid(head);
        
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while ( right != null ) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
         
        return true;

    }
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
       boolean cycle = 0

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
                
            }
        }
        if (cycle == false) {
            return;


        }

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }



    
    public static void main(String[] args) {
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next; = head;

    System.out.println();
        
    }
}

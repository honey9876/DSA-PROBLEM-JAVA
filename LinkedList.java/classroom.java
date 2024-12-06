import java.util.LinkedList;

public class classroom{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(3);
        ll.addFirst(2);

        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }

}
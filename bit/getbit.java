package bit;
public class getbit {

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
 
    public static void main(String[] args) {
        System.out.println(clearIthBit(5, 2));
    }
 }
 
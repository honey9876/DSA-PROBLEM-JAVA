package bit;

public class update {
    
    public static int updateItjBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n, i);        
        // } else{
        //     return setIthBit(n, i);
        // }  

        // n = clearIthBit(n,i);
        int BitMask = newBit<<i;
        return n |  BitMask;
    }
    public static void main(String args[]){
        System.out.println(updateItjBit(10, 1, 2));
    }

}

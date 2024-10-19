package lacture27;

public class pairing {
    public static int friendPairing(int n){
       if (n ==  1 || n == 2)  {
            return n;
       }

        int fnm1 = friendPairing(n-1);

        int fum2 = friendPairing(n-2);
        int pairWays = (n-1)*fum2; 
        
        
        int totWays = fnm1 + pairWays;
        return totWays;
    }
        
 

    public static void main(String[] args) {
        System.out.println(friendPairing(5));
        
    }
}

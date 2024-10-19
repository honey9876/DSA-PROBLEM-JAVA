package lacture26;

public class fib {
    public static int fibe(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibe( n-1);
        int fnm2 = fibe(n-2);
        int fn = fnm1 + fnm2;
        return fn;

    }
 public static void main(String[] args) {
    int n = 20;
    System.out.println(fibe(n));     
 }
}


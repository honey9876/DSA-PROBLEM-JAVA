package lacture26;

public class printxn {
    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }

        int xnum1 = power(x, n-1);
        int xn = x*xnum1;
        return xn;
    }



    public static void main(String[] args) {
        // int arr[] = {5,5,5,5,5}
        System.out.println(power(2, 10));
    }
}

package lacture26;

public class fact {
  public  static int facts(int n){
    if (n == 0) {
        return n;
    }
    int fnm1 = facts(n-1);
    int fn = n * facts(n-1);
    return fn;
  }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(facts(n));
    }
}

public class subSet {
    public static void findSubSets(String str, String ans, int i){
        if (i == str.length()) {
            
            if (ans.length() == 0) {

                System.out.println("null");
                
            }else{
                System.out.println(ans);
            }
            
            return;
        }

        findSubSets(str, ans+str.charAt(i), i+1);

        findSubSets(str, ans, i+1);

    }

    public static void main(String[] args) {
        String str = "abc";
        findSubSets(str, "", 0);
    }
}

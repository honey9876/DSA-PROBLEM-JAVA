package lacture27;
public class duplicate {
    public static void remove(String str, int idx, StringBuilder newStr, boolean map[]){
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar-'a'] == true) {
            remove(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            remove(str, idx, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        // System.out.println();
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

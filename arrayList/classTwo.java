package arrayList;

import java.util.ArrayList;

public class classTwo {
    public static void Swap(ArrayList<Integer> List, int idx1, int idx2){
        int temp = List.get(idx1);
        List.set(idx1, List.get(idx2)); 
        List.set(idx2, temp);
    }
 



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

       int  idx1 = 1, idx2 = 3;
       System.out.println(list);
       Swap(list, idx1, idx2);
       System.out.println(list);

    
    }
    
}

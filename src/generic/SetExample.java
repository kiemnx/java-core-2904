package generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

      /*  Set<String> sets = new HashSet<>();

        sets.add("A02"); // Add new item
        sets.add("D03");
        sets.add("D03"); // item is ignored
        sets.add("01");
        sets.add("04");

        for(String item : sets){
            System.out.println(item);
        }
        sets.size();

        System.out.println("ARRAY LIST: ");*/
        ArrayList<String> arrayList = new ArrayList<>();

        boolean result = arrayList.isEmpty();
        int size = arrayList.size();

        System.out.println(result);
        System.out.println(size);
    }
}

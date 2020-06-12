package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentOrder = new HashMap<>();

        studentOrder.put("SV1", 10);
        studentOrder.put("SV2", 5);

        System.out.println(studentOrder.size());

        studentOrder.put("SV1", 8);
        studentOrder.put("SV1", 9);
        studentOrder.put("SV1", 12);

        System.out.println(studentOrder.size());

        Set<String> keySet = studentOrder.keySet();
        for(String item : keySet){
            System.out.println(item);
        }

    }
}

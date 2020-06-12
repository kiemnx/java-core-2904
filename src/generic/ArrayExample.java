package generic;

import java.util.ArrayList;

public class ArrayExample {

    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(4);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(4);
        array2.add(5);

        for(Integer item: array1){
            System.out.println(item);
        }

        array1.addAll(array2);


        System.out.println("AFTER: ");
        for(Integer item: array1){
            System.out.println(item);
        }
    }
}

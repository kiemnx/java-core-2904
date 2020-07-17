package chuabai;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Activity72 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for(int i=0; i< 100000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }


        //Testing time to access element in array list
        long startTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            arrayList.remove(3);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Access array list time: " + (endTime - startTime));


        //Testing time to access element in linked list
        long startTime2 = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            linkedList.remove(3);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Access linked list time: " + (endTime2-startTime2));

    }
}

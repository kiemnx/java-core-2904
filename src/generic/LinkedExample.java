package generic;

import java.util.LinkedList;

public class LinkedExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(7);

        for(int i=0; i<linkedList.size(); i++){
            System.out.println("Gia tri phan tu thu " + (i+1) + " la: " + linkedList.get(i));
        }

        linkedList.add(5);

        System.out.println("After ADD: ");
        for(int i=0; i<linkedList.size(); i++){
            System.out.println("Gia tri phan tu thu " + (i+1) + " la: " + linkedList.get(i));
        }

        linkedList.remove(1);

        System.out.println("After REMOVE: ");
        for(int i=0; i<linkedList.size(); i++){
            System.out.println("Gia tri phan tu thu " + (i+1) + " la: " + linkedList.get(i));
        }

        Integer item = linkedList.get(2);
        System.out.println(item);
    }
}

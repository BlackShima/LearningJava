package Lab12;

import java.util.ArrayList;
import java.util.Collections;

public class Sorter {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Peach");
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Grape");

        System.out.println("Original list: " + list);
        sort(list);
        System.out.println("Sorted list: " + list);
    }
}


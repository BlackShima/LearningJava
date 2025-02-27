package Lab12;

import java.util.ArrayList;
import java.util.Collections;

public class MinEleFinder {
    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        return Collections.min(list);
    }

    public static void main(String[] args) {
        // Example usage with an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(4);

        System.out.println("The smallest element is: " + min(numbers));

        // Example usage with an ArrayList of Strings
        ArrayList<String> words = new ArrayList<>();
        words.add("Peach");
        words.add("Apple");
        words.add("Orange");
        words.add("Banana");

        System.out.println("The smallest element is: " + min(words));
    }
}


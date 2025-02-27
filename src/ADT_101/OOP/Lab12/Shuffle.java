package Lab12;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("Original list: " + list);
        shuffle(list);
        System.out.println("Shuffled list: " + list);
    }
}


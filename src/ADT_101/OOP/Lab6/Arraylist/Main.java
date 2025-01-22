package OOP.Lab6.Arraylist;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan());
        list.add("ABC");
        list.add(new Date());
        list.add(new Circle());

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}


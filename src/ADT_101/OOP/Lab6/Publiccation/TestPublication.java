package OOP.Lab6.Publiccation;

import java.util.*;

public class TestPublication {
    public static void main(String[] args) {
        Publication[] publications = new Publication[10];

        publications[0] = new Publication("Penguin", 200, 19.99, "General Publication 1");
        publications[1] = new Magazine("Time Inc.", 50, 5.99, "Weekly Magazine", "Weekly.");
        publications[2] = new Book("HarperCollins", 300, 29.99, "Famous Book", "John Doe");
        publications[3] = new KidsMagazine("Disney", 30, 4.99, "Monthly Kids Magazine", "Monthly", "3-7 years");

        for (Publication publication : publications) {
            if (publication != null) {
                publication.print();
                System.out.println();
            }
        }
    }
}

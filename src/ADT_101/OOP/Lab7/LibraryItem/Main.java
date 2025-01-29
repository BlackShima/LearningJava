package OOP.Lab7.LibraryItem;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LibraryItem[] libraryItems = new LibraryItem[3];
        Random random = new Random();

        for (int i = 0; i < libraryItems.length; i++) {
            
            switch (i) {
                case 0:
                    libraryItems[i] = new Book("B00" ,  "Book Title ");
                    break;
                case 1:
                    libraryItems[i] = new Audiobook("A00" , "Audiobook Title " );
                    break;
                case 2:
                    libraryItems[i] = new DVD("D00" ,  "DVD Title ");
                    break;
            }

            System.out.println("Barcode: " + libraryItems[i].getBarcode() +
                               ", Title: " + libraryItems[i].getTitle() +
                               ", Loan Period: " + libraryItems[i].getLoanPeriod() + " days");
            libraryItems[i].checkout("Sample Borrower");
        }
    }
}

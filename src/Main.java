
import java.util.Arrays;

public class Main {
        public static void main(String[] args){
            Book[] myBook = new Book[3];
            myBook[0] = new Book("1984", "Alice", 1949);
            myBook[1] = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
            myBook[2] = new Book("The girl", "F. Scott", 1920);

            Arrays.sort(myBook);

            for (Book book : myBook) {
                System.out.println(book.getTitle() + "_" + book.getYear() );
            }
        }
    }

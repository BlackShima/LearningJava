package OOP.Lab6.Publiccation;

public class Book extends Publication {
    private String author;

    public Book(String publisher, int numberOfPages, double price, String title, String author) {
        super(publisher, numberOfPages, price, title);
        this.author = author;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Author: " + author);
    }
}
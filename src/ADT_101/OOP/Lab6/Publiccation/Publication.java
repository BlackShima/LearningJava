package OOP.Lab6.Publiccation;

public class Publication {
    private String publisher;
    private int numberOfPages;
    private double price;
    private String title;

    public Publication(String publisher, int numberOfPages, double price, String title) {
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.title = title;
    }

    public Publication(Magazine magazine, String string) {
    }

    public void print() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Price: " + price);
        System.out.println("Title: " + title);
    }
}

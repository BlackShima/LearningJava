package OOP.Lab6.Publiccation;

public class Magazine extends Publication {
    private String publicationUnit;

    public Magazine(String publisher, int numberOfPages, double price, String title, String publicationUnit) {
        super(publisher, numberOfPages, price, title);
        this.publicationUnit = publicationUnit;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Publication Unit: " + publicationUnit);
    }
}
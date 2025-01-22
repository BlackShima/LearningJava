package OOP.Lab6.Publiccation;

public class KidsMagazine extends Magazine {
    private String recommendedAgeRange;

    public KidsMagazine(String publisher, int numberOfPages, double price, String title, String publicationUnit, String recommendedAgeRange) {
        super(publisher, numberOfPages, price, title, publicationUnit);
        this.recommendedAgeRange = recommendedAgeRange;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Recommended Age Range: " + recommendedAgeRange);
    }
}
package OOP.Lab7.LibraryItem;

public abstract class LibraryItem {
    protected String barcode;
    protected String title;

    public LibraryItem(String barcode, String title) {
        this.barcode = barcode;
        this.title = title;
    }

    public abstract String getBarcode();
    public abstract String getTitle();
    public abstract int getLoanPeriod();

    public abstract void checkout(String borrowerName);
}
    class Book extends LibraryItem {
        public Book(String barcode, String title) {
            super(barcode, title);
        }
        public String getBarcode() {
            return barcode;
        }
        public String getTitle() {
            return title;
        }
        public int getLoanPeriod() {
            return 21;
        }
        public void checkout(String borrowerName){
            System.out.println("Book checked out by " + borrowerName);
        }
    }
    
    class Audiobook extends LibraryItem {
        public Audiobook(String barcode, String title) {
            super(barcode, title);
        }
        public String getBarcode() {
            return barcode;
        }
        public String getTitle() {
            return title;
        }
        public int getLoanPeriod() {
            return 14;
        }
        public void checkout(String borrowerName){
            System.out.println("Audiobook checked out by " + borrowerName);
        }
    }
    
    class DVD extends LibraryItem {
        public DVD(String barcode, String title) {
            super(barcode, title);
        }
        public String getBarcode() {
            return barcode;
        }
        public String getTitle() {
            return title;
        }
        public int getLoanPeriod() {
            return 7;
        }
        public void checkout(String borrowerName){
            System.out.println("DVD checked out by " + borrowerName);
        }
        
    }
    



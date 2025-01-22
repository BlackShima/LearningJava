package OOP.Lab6.Arraylist;

class Loan {
    private String name;
    private double amount;

    public Loan() {
        this.name = "John Doe";
        this.amount = 0.0;
    }

    public Loan(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nAmount:" + amount ;
    }
}
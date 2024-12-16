package LearningJava;

public class Emain {

    public static void main(String[] args) {
        Programmer p1=new Programmer();
        p1.setId("1");
        p1.setName("John Doe");
        p1.setSalary(50000.0);
        p1.disPlayEmployees();

        Accounting ac1=new Accounting();
        ac1.setName("Rina Maryou");
        ac1.setSalary(60000.0);
        ac1.disPlayEmployees();
    }
}

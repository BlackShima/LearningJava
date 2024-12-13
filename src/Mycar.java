

public class Mycar {
    public static void main(String[] args) {
    Car toyota = new Car("red");
    toyota.setSpeed(200);
    toyota.setMilage(1345);
    Car honda = new Car("blue");
    honda.setSpeed(300);
    honda.setMilage(8987);
    System.out.println("Toyota:");
    System.out.println("Color: " + toyota.getColor() + " Speed: " +
    toyota.getSpeed() + " Mileage: " + toyota.getMilage());
    System.out.println("Honda:");
    System.out.println("Color: " + honda.getColor() + " Speed: " + honda.getSpeed()
    + " Mileage: " + honda.getMilage());
    }
    }
    
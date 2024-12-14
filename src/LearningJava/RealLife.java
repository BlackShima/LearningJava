package LearningJava;

public class RealLife {
    public static void main(String[] args) {
        int iteams = 50;
        float costPerItem = 9.99f;
        float totalCost = iteams * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + iteams);
        System.out.println("Cost per item: " + currency + costPerItem);
        System.out.println("Total cost: " + currency + totalCost);
    }
}

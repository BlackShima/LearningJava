package LearningJava;

public class WideningCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Widening Casting: Automatically converts int to double

        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); //Outputs 9.0
    }
}

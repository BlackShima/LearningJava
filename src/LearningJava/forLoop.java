package LearningJava;

public class forLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        for(int x = 1; x <= 2; x++) {
            System.out.println("x : " +x);
        for (int y = 1; y <= 5; y++) {
            System.out.println("y : " + y);
        }
        }

        String[] cars = {"Volvo", "BMW" , "Ford" , "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        int num2 = 2;
        //Print the multiplication table for the num2
        for (int a = 1; a<=12;a++)  {
            System.out.println(num2 + " x " + a + " = " + (num2 * a));
      ;  }
    }
}

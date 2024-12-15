package LearningJava;

public class whileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 8) {
            i++;
            System.out.println("Inside the loop");
        }

        int x = 0;
        do {
            System.out.println(x);
            x++;
        }
        while (x < 5);

        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!");

        int dice = 1;
        while (dice <= 6) {
            if (dice <6) {
                System.out.print("No Yatzy.");
            }else {
                System.out.println("Yatzy!");
            }
            dice += 1;
        }
    }
}

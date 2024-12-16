package JavaExercises;
import java.util.Scanner;
public class BooleanExpressions {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        // Allow the user to set the value of isSunny through input
        System.out.print("Is it sunny to day? (true/false): ");
        boolean isSunny = Boolean.parseBoolean(userInput.nextLine());

        // Check the value of isSunny and print the appropriate message
        if(isSunny){
            System.out.println("Let's go outside!");
        }
        else {
            System.out.println("Stay home, it's not sunny today.");
        }
    }
}

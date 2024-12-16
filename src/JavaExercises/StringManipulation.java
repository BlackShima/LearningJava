package JavaExercises;
import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner userName = new Scanner(System.in); // create scanner object
        System.out.print("Enter your name: ");
        String name = userName.nextLine(); // Read user input

        Scanner aGe = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String age = aGe.nextLine(); // Read user input

        String upperCase = name.toUpperCase(); // convert string to upper case
        System.out.println("Your name: " + upperCase);

        String lowerCase = name.toLowerCase(); // convert string to lower case
        System.out.println("Your age: " + lowerCase);



    }

}

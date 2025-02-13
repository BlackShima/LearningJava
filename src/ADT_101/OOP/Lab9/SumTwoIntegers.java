package OOP.Lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                num1 = scanner.nextInt();
                System.out.print("Enter another integer: ");
                num2 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        int sum = num1 + num2;
        System.out.println("The numbers entered is " + sum);
    }
}

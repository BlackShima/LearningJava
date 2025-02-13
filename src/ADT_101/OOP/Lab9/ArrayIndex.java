package OOP.Lab9;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class ArrayIndex {
    public static void main(String[] args){
        int[] array = new int[100];
        Random rand=new Random();
        for(int i=0; i<100; i++){
            array[i] = rand.nextInt();
        }
        Scanner input = new Scanner(System.in);
        boolean validIndex = true;
        while (validIndex) {
            try {
                System.out.print("Please enter index of the array (0 - 99): ");
                int index = input.nextInt();

                // Display the corresponding element value
                System.out.println("The value at index " + index + " is " + array[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You refer yo index that does not exist.");
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input: an integer is required");
                input.nextLine(); // Clear the invalid input
            } finally{
                System.out.println("Continuing processing. . .");

            }
        }
    }
}
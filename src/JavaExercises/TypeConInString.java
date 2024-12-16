package JavaExercises;
import java.util.Scanner;

public class TypeConInString {
    public static void main(String[] args) {
        Scanner userNumber=new Scanner(System.in);

        System.out.print("Enter your numeber: ");
        int number = Integer.parseInt(userNumber.nextLine());

        int
        result=number*2;

        System.out.println("Your number is: "+number);
        System.out.println("We do your number to mutipile by 2 is: "+result);
    }
}

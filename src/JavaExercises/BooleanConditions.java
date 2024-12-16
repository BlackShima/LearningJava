package JavaExercises;
import java.util.Scanner;

public class BooleanConditions {

    public static void main(String[] args) {
        Scanner ageUser = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(ageUser.nextLine());

        if(age <= 99 && age >= 18){
            System.out.print("You have eligible to vote.");
        }
        else if(age <18){
            System.out.print("You are not eligible to vote.");
        }
        else{
            System.out.print("Get out of here.");
        }
    }
}

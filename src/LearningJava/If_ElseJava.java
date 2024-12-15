package LearningJava;

public class If_ElseJava {
    public static void main(String[] args) {
        int myAge = 25;
        int votingAge = 18;

        if (myAge < votingAge) {
            System.out.println("false");
        } else if (myAge == votingAge) {
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}

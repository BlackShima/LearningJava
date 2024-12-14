package LearningJava;

public class NumberAndString {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = x + y; //z will be 30 (an integer/number)

        String a = "10";
        String b = "20";
        String c = a + b; //c will be "1020" (a string/sequence of characters)

        String d = a + y; //d will be "1020" (a string/sequence of characters)

        System.out.println(z);
        System.out.println(c);
        System.out.println(d);
    }
}

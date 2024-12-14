package LearningJava;

public class String101 {
    public static void main(String[] args){
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("The txt string is: " + txt.length());

        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());

        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); //Outputs 7
    }
}

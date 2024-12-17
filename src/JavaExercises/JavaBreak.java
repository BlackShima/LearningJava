package JavaExercises;

public class JavaBreak {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            if(i==4){
                break;
            }
            System.out.println(i);
        }
        int a = 0;
        while (a<10){
            System.out.println(a);
            a++;
            if (a ==4){
                continue;
            }
        }
    }
}

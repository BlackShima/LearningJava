package JavaExercises;

public class JavaArrayLoop {
    public static void main(String[] args) {
        String[] cars={"volvo", "bmw", "ford", "mazda"};
        for (int i = 0;i<cars.length;i++) {
            System.out.println(cars[i]);
        }
        for(String i : cars) {
            System.out.println(i);
        }
    }
}

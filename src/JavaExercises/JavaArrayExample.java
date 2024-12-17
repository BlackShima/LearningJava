package JavaExercises;

public class JavaArrayExample {
    public static void main(String[] args) {
        // An Array Storing
        int ages[] ={20,22,18,35,45,26,87,70};
        float avg, sum=0;

        //get the length
        int length = ages.length;

        //loop through the elements
        for ( int age : ages ) {
            sum += age;
        }
        //calculate the average by dividing the sum by the length
        avg = sum / length;

        //display the average
        System.out.println("Average age of the array: " + avg);

        int lowestAge = ages[0];

        for (int age : ages) {
            if (lowestAge>age){
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the array is: "+lowestAge);
    }
}

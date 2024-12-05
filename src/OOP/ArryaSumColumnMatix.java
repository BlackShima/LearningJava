package OOP;

import java.util.Scanner;

public class ArryaSumColumnMatix {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[][] matrix = new double[3][4];

            System.out.println("Enter a 3-by-4 matrix in row by row:");
            int z=0;
            for (z = 0; z < 3 ; z++){
                for (int j  = 0; j < 4 ; j++){
                    matrix[z][j] = scanner.nextDouble();
                }
            }
            // for (int column = 0; column < 4 ; column++){
            //     double sum = sumColumn(matrix, column);
            //     System.out.println(("Sum of element at column " + column + " is " + sum));
            // }
           
            scanner.close();

       
        
    }
 public static double sumColumn(double[][] m, int columnIndex){
                   double sum = 0;

                   for (int i = 0; i < m.length; i++){
                    sum = sum + m[i][columnIndex];
                   }
            
            return sum;
                }
}

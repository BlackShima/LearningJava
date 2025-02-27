package Lab11;

import java.io.*;
import java.util.*;

public class RWData {
    public static void main(String[] args) {
        String filename = "RWdata.txt";

        
        writeRandomNumbersToFile(filename);

        
        readAndSortNumbersFromFile(filename);
    }

    
    public static void writeRandomNumbersToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            Random ran = new Random();
            for (int i = 0; i < 100; i++) {
                writer.print(ran.nextInt(1000) + " "); // Random Number 0 - 100
            }
            System.out.println("Random numbers written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    public static void readAndSortNumbersFromFile(String filename) {
        List<Integer> num = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextInt()) {
                num.add(fileScanner.nextInt());
            }
            Collections.sort(num);

            System.out.println("Sorted numbers:");
            for (int numbers : num) {
                System.out.print(numbers + " ");
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}


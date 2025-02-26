package Lab11;

import java.io.*;
import java.util.*;

public class RWData {
    public static void main(String[] args) {
        String filename = "RWdata.txt";

        // สร้างไฟล์และเขียนข้อมูลแบบสุ่ม
        writeRandomNumbersToFile(filename);

        // อ่านข้อมูลจากไฟล์และแสดงผลแบบเรียงลำดับ
        readAndSortNumbersFromFile(filename);
    }

    // ฟังก์ชันเขียนตัวเลขสุ่มลงไฟล์
    public static void writeRandomNumbersToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                writer.print(random.nextInt(1000) + " "); // สุ่มตัวเลข 0-999
            }
            System.out.println("Random numbers written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // ฟังก์ชันอ่านข้อมูลจากไฟล์และเรียงลำดับ
    public static void readAndSortNumbersFromFile(String filename) {
        List<Integer> numbers = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextInt()) {
                numbers.add(fileScanner.nextInt());
            }

            // เรียงลำดับจากน้อยไปมาก
            Collections.sort(numbers);

            // แสดงผลลัพธ์
            System.out.println("Sorted numbers:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}


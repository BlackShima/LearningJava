package Lab11;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScoreProcessor {
    public static void main(String[] args) {
        // รับชื่อไฟล์จากผู้ใช้
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = input.nextLine();
        
        File file = new File(filename);

        try {
            Scanner fileScanner = new Scanner(file);
            double total = 0;
            int count = 0;

            // อ่านค่าจากไฟล์และคำนวณผลรวม
            while (fileScanner.hasNext()) {
                if (fileScanner.hasNextDouble()) {
                    total += fileScanner.nextDouble();
                    count++;
                } else {
                    fileScanner.next(); // ข้ามค่าที่ไม่ใช่ตัวเลข
                }
            }

            fileScanner.close();

            // คำนวณค่าเฉลี่ย
            double average = (count > 0) ? total / count : 0;

            // แสดงผลลัพธ์
            System.out.println("Total: " + total);
            System.out.printf("Average: %.2f\n", average);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}

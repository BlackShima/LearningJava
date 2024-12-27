package ADT_101.ProgrammingAssignment;

import java.io.*;
import java.util.*;

public class MainStudent{
    public static void main(String[] args) {
        Vector<Student> students = new Vector<Student>();
        try (Scanner scanner = new Scanner(new File("C://Users//Black//OneDrive//Desktop//adtassign//class_roaster67.csv"),"UTF-8")) {

            for(int x =0;x<7&&scanner.hasNextLine();x++){
                scanner.nextLine();
            }
            while (scanner.hasNextLine()) {
                String read = scanner.nextLine();
                String[] data = read.split(",");
                if (data.length >= 4) {
                    String cd = data[0].trim();
                    String id = data[1].trim();
                    String first = data[2].trim();
                    String last = data[3].trim();
                    students.add(new Student(cd, id, first, last));  // Adding Student to the vector
                }
            }
            


            sortStudents(students);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + e.getMessage());
        }
    }
    public static void sortStudents(Vector<Student> students){
        Scanner input = new Scanner(System.in);
        //String command;

        System.out.println("Options to comand:");
        System.out.println("-n Sort the Number of Students");
        System.out.println("-f Sort the First Name");
        System.out.println("-l Sort the Last Name");
        System.out.println("-s Sort the Search Students");

        System.out.println("Enter command: ");
        String command = input.nextLine();

        switch (command) {
            case "-n":
            IdFirstLast(students, "Id");
                break;
            case "-f":
            IdFirstLast(students, "First");
                break;
            case "-l":
                IdFirstLast(students, "Last");
                break;
            case "-s":
                
                System.out.println("Enter your students: ");
                String name = input.nextLine().toUpperCase();
                int index = searchStudent(students, name);
                if(index != -1){
                    System.out.println("Student found: " + index);
                }
                else{
                    System.out.println("Student not found");
                }
                return;
                
            default:
            System.out.println("Invalid command. Exiting.");
                break;
        }
        input.close();

        for(Student student : students) {
            System.out.println(student);
        }
    }

    public static void IdFirstLast(Vector<Student> students, String criterion) {
        for (int i = 0; i < students.size()-1; i++) {
            for (int j = 0; j < students.size() - i-1; j++) {
                boolean swap = false;

                switch(criterion){
                    case"Id":
                        if (students.get(j).getId().compareTo(students.get(j+1).getId())>0){
                            swap = true;
                        }
                        break;

                    case"First":
                        if (students.get(j).getFirst().compareTo(students.get(j+1).getFirst())>0){
                            swap = true;
                        }
                        break;

                    case"Last":
                        if (students.get(j).getLast().compareTo(students.get(j+1).getLast())>0){
                            swap = true;
                        }
                        break;
                }
                if (swap) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j+1));
                    students.set(j+1, temp);
                }
            }
        }
    }
    public static int searchStudent(Vector<Student> students,String searchTerm){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student your student:  ");
        
        

        boolean found = false;
        for(int i = 0; i < students.size(); i++){
            if(searchTerm.equals(students.get(i).getFirst())){
                return i;
            }
        }
        return -1;
    }
}
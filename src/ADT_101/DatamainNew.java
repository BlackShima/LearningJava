package ADT_101;

/*import java.util.Scanner;
import java.io.File;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Vector;

public class DatamainNew {
    //Main method
    public static void main(String[] args) throws IOException {

        Vector<String> studentInfo = new Vector<String>();
        Vector<Student> students = new Vector<Student>();
        File file = new File("mycsvfile.csv"); //-----------------------File directory-----------------------//.
        Scanner input = new Scanner(file);
        boolean isStart = true;

        if (file.getName() != "mycsvfile.csv") { // Check if file is .csv or others
            System.out.println("File is not found or invalid file type \nMust be CSV filetype only!!!!");
            isStart = false;
        }



        while (input.hasNextLine()) {
            String line = input.nextLine();
            StringTokenizer st = new StringTokenizer(line, ",");
            if (line.contains("2115"))  {
                while (st.hasMoreTokens()) {
                    studentInfo.add(st.nextToken()); // Insert every token into studentInfo
                }
            }
        }

        addStudent(studentInfo, students); // Create student obj. and add into student vector
        Vector<Character> alphabet = new Vector<Character>(12);
        for (int i = 0; i < students.size(); i++)   {
            alphabet.add(students.get(i).getFirstName().charAt(0));
        }
        displayResult(students, alphabet,isStart);
        input.close();

    } // End of main method


    // Other methods

    public static void displayResult(Vector<Student> students, Vector<Character> alphabet, boolean isStart)  { // Start displayResult method
        if (isStart) {
            System.out.println("Total students: " + students.size());
            for (char letter = 'A'; letter <= 'Z'; letter++) {
                if (count( alphabet, letter ) != 0) {
                    System.out.println( letter + ": " + count(alphabet, letter) + " ");
                    for (int i = 0; i < students.size(); i++)   {
                        if (students.get(i).getFirstName().charAt(0) == letter) {
                            System.out.println(students.get(i).getSID() + ", " + students.get(i).getFirstName() + " " + students.get(i).getLastName());
                        }
                    }
                }
            }
            System.out.println("Program terminate properly.");
        }
    } // End of displayMethod

    public static void addStudent(Vector<String> studentInfo, Vector<Student> students) { // Start addStudent method
        for (int i = 0; i < studentInfo.size(); i+=4)    {
            Student st = new Student(null, null, null);
            st.setSID(studentInfo.elementAt(i+1));
            st.setFirstName(studentInfo.elementAt(i+2));
            st.setLastName(studentInfo.elementAt(i+3));
            students.add(st);
        }
    } // End of addStudent method

    public static int count(Vector<Character> alphabet, char letter)   { // Start count method
        int count = 0;
        Character.toUpperCase(letter);
        for (char l : alphabet) {
            if (letter == l)    {
                count++;
            }
        }
        return count;
    } // End of count methood
} // End of the NameSorting class*/
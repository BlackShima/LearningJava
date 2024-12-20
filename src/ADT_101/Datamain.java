/*package ADT_101;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import java.util.StringTokenizer;

public class Datamain {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("/Users/Black/OneDrive/Desktop/ADT/953102_701000-2.csv");
        Scanner in = new Scanner(f);
        boolean isStart=true;
        if (f.getName() != "953102_701000-2.csv") { // Check if file is .csv or others
            System.out.println("File is not found or invalid file type \nMust be CSV filetype only!!!!");
            isStart = false;
        }

        for (int i = 0; i < 7; i++) {
            in.nextLine();
        }
        Vector<Student> student = new Vector<Student>();
        //int index = 0;
        while (in.hasNextLine()) {
            String dataLine = in.nextLine();
            StringTokenizer stu = new StringTokenizer(dataLine.trim(), ",");
            stu.nextToken();
            student.addElement(new Student(stu.nextToken(), stu.nextToken(), stu.nextToken()));
        }
        DisplayResult(student);

        for (Student i : student) {
            System.out.println(i.toString());
        }
        int[] firstNameCount=new int[student.size()];
        int[] firstLetterCount=new int[26];//count A-Z

        for(int q=0;q<student.size();q++){
            Student stu = student.get(q);

            int count =0;
            for(int w=0;w< student.size();w++){
                if(stu.getFirstName().equals(student.get(w).getFirstName())){
                    count++;
                }
                for(int e=0;e<student.size();e++){
                    String firstName = student.get(e).getFirstName();
                    if(firstNameCount[e]>0){

                    }
                }
            }
            char ch;
            for(ch = 'A';ch<='Z';ch++) {
                int letterCount = firstLetterCount[ch - 'a'];
                if(letterCount>0){
                    System.out.println(ch + ": "+letterCount );
                }
            }
        }


        in.close();

    }

    public static void DisplayResult(Vector<Student> students) {
        System.out.println("Total student: " + students.size());

        int countA = 0;
        for (Student student : students) {
            if (student.getFirstName().startsWith("A")) {
                countA++;
                System.out.println(student.toString());
            }

        }
        char ch;
        for(ch = 'A';ch<='Z';ch++) {
                System.out.println(ch + ": ");
            }
        }
    public static void addStudent(Vector<String> studentInfo, Vector<Student> students) { // Start addStudent method
        for (int i = 0; i < studentInfo.size(); i+=4)    {
            Student st = new Student(null, null, null);
            st.setSID(studentInfo.elementAt(i+1));
            st.setfName(studentInfo.elementAt(i+2));
            st.setlName(studentInfo.elementAt(i+3));
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
} // End of the NameSorting class

    */







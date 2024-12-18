package ADT_101;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import java.util.StringTokenizer;

public class Data {

        public static void main(String[] args) throws FileNotFoundException {
            File f = new File("/Users/Black/OneDrive/Desktop/ADT/953102_701000-2.csv");
            Scanner in = new Scanner(f);

            for(int i=0;i<7;i++) {
            in.nextLine();
            }
            Vector<Student> student=new Vector<Student>();
            int index=0;
            while(in.hasNextLine()) {
                String dataLine = in.nextLine();
                StringTokenizer stu = new StringTokenizer(dataLine.trim(), ",");
                stu.nextToken();
                student.addElement(new Student(stu.nextToken(),stu.nextToken(),stu.nextToken()));
            }
            for(Student i:student){
                System.out.println(i.toString());
            }
            in.close();

        }
        public void DisplayResult(Vector<Student> students){
            System.out.println("Total student"+ students.size());
                int countA=0;
                for (Student student:students){
                    if(student.getFirstName().startsWith("A")){
                        countA++;
                        System.out.println(student.toString());
                    }
                }
                System.out.println("A: "+countA);
            //detail of student begin with A
            }

        }



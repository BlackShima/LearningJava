package ADT_101.Tutorial;

import java.util.*;

class Student {
    String fname;
    String lname;
    double GPA;
    int stuId;

    public Student(String fname, String lname, double GPA, int stu){
        this.fname = fname;
        this.lname = lname;
        this.GPA = GPA;
        this.stuId = stu;   
    }
    @Override
    public String toString(){
        return this.fname + "," + this.lname + "," + this.GPA + "," + this.stuId+"\n";
    }
}
    
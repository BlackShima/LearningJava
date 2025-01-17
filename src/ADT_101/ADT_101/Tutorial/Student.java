package ADT_101.Tutorial;

import java.util.*;

class Student {
    private String fname;
    private String lname;
    private double GPA;
    private int stuId;

    public Student(String fname, String lname, double GPA, int stu){
        this.fname = fname;
        this.lname = lname;
        this.GPA = GPA;
        this.stuId = stu;   
    }
    @Override
    public String toString(){
        return fname + "," + lname + "," + GPA + "," + stuId+"\n";
    }
    public String getfname() {
        return fname;
    }
    public String getlname() {
        return lname;
    }
    public double getGPA() {
        return GPA;
    }
    public int getstuId() {
        return stuId;
    }

}
    
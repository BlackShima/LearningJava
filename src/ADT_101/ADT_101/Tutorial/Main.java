package ADT_101.Tutorial;

public class Main{
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        
        Student stu = new Student("Jone","Datey",3.50,2546);
        Student stu1 = new Student("Bala","Day",3.11,5463);
        Student stu2 = new Student("Ibombe","Taya",3.23,7986);
        Student stu3 = new Student("IOlay","Tonma",2.51,2555);
        Student stu4 = new Student("Shywawa","Polo",4.00,2623);
        Student stu5 = new Student("Youna","Maname",1.50,7500);
        Student stu6 = new Student("Ihere","Banama",2.50,6599);
        stack.push(stu);
        stack.push(stu1);
        stack.push(stu2);
        stack.push(stu3);
        stack.push(stu4);
        stack.push(stu5);
        stack.push(stu6);

        
}
}
package ADT_101.Tutorial;

import java.util.*;


public class stack {
    private int maxSize;
    Vector<Student> stackArray;
    private int top;

    public stack(int s) {
        maxSize = s;
        stackArray = new Vector<>(maxSize);
        top = -1; 
        }

    public void push(String fname, String lname , double GPA,int stuId) {
        stackArray.addElement(new Student(fname, lname, GPA, stuId));
        top++;
        }
    public Student pop() {
        return stackArray.remove(top--);
        }
    public Student peek() {
        return stackArray.get(top);
        }
    public boolean isEmpty() {
        return (top == -1);
        }
    public boolean isFull() {
        return (top == maxSize - 1);
        }
    public int getTop(){
        return top;
    }
    public void showElement(){
        System.out.println(stackArray);
    }
}
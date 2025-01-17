package ADT_101.Tutorial;

import java.util.*;


class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    
    public void push(Student value) {
        if (!isFull()) {
            
            System.out.println(value);
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    
    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }


    public boolean isFull() {
        return (top == maxSize - 1);
    }
}


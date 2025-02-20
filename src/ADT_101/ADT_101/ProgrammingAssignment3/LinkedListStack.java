package ProgrammingAssignment3;

public class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }
    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next=top;
        top = newNode;
    }
    public char pop(){
        if (top==null){
            System.out.println("Stack is empty");
            return '\0';
        }
        char data = top.data;
        top = top.next;
        return data;
    }
    public char peek(){
        if (top==null){
            System.out.println("Stack is empty");
            return '\0';
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top==null;
    }
}

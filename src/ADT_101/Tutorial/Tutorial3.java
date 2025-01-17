package ADT_101.Tutorial;

class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack with a given capacity
    public ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // Initialize the stack as empty
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    // Method to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return an invalid value indicating failure
        }
        return stack[top--];
    }

    // Method to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1; // Return an invalid value indicating failure
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to get the current size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        // Initialize the stack with a size of 5
        ArrayStack stack = new ArrayStack(5);

        // Push the student ID (e.g., 12345) to the stack
        stack.push(12345);

        // Peek at the top element and print it
        System.out.println("Peek: " + stack.peek());

        // Pop three elements from the stack and print them
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        // Print the number of elements left in the stack
        System.out.println("Elements left in stack: " + stack.size());
    }
}

package ADT_101.Tutorail4;

import java.util.LinkedList;
import java.util.Queue;


public class HelpdeskQueue {
    private Queue<String> queue;
    private int capacity;
    private int first;
    private int rear;
    private int length;

    public HelpdeskQueue(int capacity) {
        queue = new LinkedList<>();
        this.capacity = capacity ;
        this.first=0;
        this.rear=0;
        this.length=0;
    }

    public void enqueue(String student) {
        if(!isFull()){
            queue.add(student);
            rear=(rear+1)%capacity;
            length++;
            System.out.println("Enqueue " + student);
            printQueue();
        } else{
            System.out.println("Queue is full. Can not add Student " + student);
        }
    }

    public void dequeue() {
        if (!queue.isEmpty()) {
            String servedStudent = queue.poll();
            first= (first+1)%capacity;
            length--;
            System.out.println("Dequeue " + servedStudent);
        } else {
            System.out.println("No students in the queue.");
        }
    }

    public int size() {
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public boolean isFull(){
        return length == capacity;
    }
    public void printQueue(){
        System.out.println(queue+"[ First: " + first+", rear: "+ rear+ ", length: " + length+"]");
    }
}


package ADT_101.Tutorail4;

import java.util.Scanner;

public class testRunHDQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HelpdeskQueue helpdeskQueue = new HelpdeskQueue(5);

        System.out.println("Please enter student name (enter ' quit' to stop entering names, 'dq' to dequeue):");

        while(true){
            String queueInput = input.next();

            if (queueInput.equals("quit")){
                break;
        }else if (queueInput.equals("dq")){
            helpdeskQueue.dequeue();
        }else{
            helpdeskQueue.enqueue(queueInput);
        }
       
        System.out.println("Queue size: " + queueInput.length());
        System.out.println("The helpDeskQueue is empty: " + helpdeskQueue.isEmpty());
        System.out.println("The helpDeskQueue is full: " + helpdeskQueue.isFull()+ "\n");
    }
    input.close();
}
}
    

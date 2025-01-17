package ADT_101.Tutorial;

public class Main{
    public static void main(String[] args) {
        stack stack = new stack(7);
        
        stack.push("Jone","Datey",3.50,2546);
        stack.push("Bala","Day",3.11,5463);
        stack.push("Ibombe","Taya",3.23,7986);
        stack.push("IOlay","Tonma",2.51,2555);
        stack.push("Shywawa","Polo",4.00,2623);
        stack.push("Youna","Maname",1.50,7500);
        stack.push("Ihere","Banama",2.50,6599);

        stack.showElement();

        stack.peek();
        stack.pop();
        stack.pop();

        System.out.println("Elements left in stack: " + stack.getTop());
        
}
}
package OOP.Lab8.Lab8_1;

public class TestInterfacelab_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(15);

        int flag = circle1.compareTo(circle2);
        switch (flag) {
            case 1:
                System.out.println("The max circle's radius is "+ circle1.getRadius());
                break;
            case -1:
                System.out.println("The max circle's radius is "+ circle2.getRadius());
                break;
            default:
                System.out.println("Both circles have the same radius.");
                break;
        }
    }
    
}

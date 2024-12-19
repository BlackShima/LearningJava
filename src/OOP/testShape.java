package OOP;

import java.rmi.ConnectIOException;

public class testShape {
    public static void main(String[] args){
        //test shape
        Shape sh1=new Shape();
        System.out.println();
        System.out.println(sh1);
        Shape sh2= new Shape();
        System.out.println(sh2);

        //test circle
        Circle cc1=new Circle();
        System.out.println(cc1);
        Circle cc2 = new Circle(2.5);
        System.out.println(cc2);
        System.out.println("Area: "+cc2.getArea());
        System.out.println("Parameter: "+cc2.getPerimeter());
        Circle cc3=new Circle();
        System.out.println(cc3);

        //test Rectangle
        Rectangle rc1=new Rectangle();
        System.out.println(rc1);
        Rectangle rc2=new Rectangle();
        System.out.println(rc2);
        System.out.println("Area: " + rc2.getArea());
        System.out.println("Perimeter: " + rc2.getPerimeter());
        Rectangle rectangle3 = new Rectangle(6.0, 7.0, "green", true);
        System.out.println(rectangle3);

    }
}

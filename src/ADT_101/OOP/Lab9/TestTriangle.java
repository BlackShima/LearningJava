package OOP.Lab9;

public class TestTriangle {
    public static void main(String[] args) {
        try {
            TriangleClass t1 = new TriangleClass(2.0, 2.5, 1.5);
            System.out.println("Perimeter for t1: " + t1.getPerimeter());
            System.out.println("Area for t1: " + t1.getArea());

            TriangleClass t2 = new TriangleClass(1.0, 2.0, 3.0);
            System.out.println("Perimeter for t2: " + t2.getPerimeter());
            System.out.println("Area for t2: " + t2.getArea());
        } catch (IllegalTriangle e) {
            System.out.println("Illegal triangle: ");
            System.out.println("Side1: "+e.getSide1());
            System.out.println("Side2: "+e.getSide2());
            System.out.println("Side3: "+e.getSide3());
        }
    }
}




public class Rectangle {
    private double width;
    private double height;
    private double area;
    private double perimeter;
    public Rectangle(double x , double y )
    {
    width = x;
    height = y;
    }
    public double area(){
    return width * height;
    }
    public double perimeter(){
    return 2 * (width + height);
    }
    }
    
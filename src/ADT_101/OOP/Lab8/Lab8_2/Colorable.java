package OOP.Lab8.Lab8_2;

public interface Colorable {

    public abstract void howToColor();    
}

class Square extends GeometricObject_1 implements Colorable {

    private double side;

    public Square(){
        this.side = 0;
    }
    public Square(double side){
        this.side = side;
    }
    public void setSquare(double side){
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }
    @Override
    public void howToColor() {
        System.out.println("Color the square");
    }
    @Override
    public double getArea() {
        return this.side * this.side;
    }
    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }
}
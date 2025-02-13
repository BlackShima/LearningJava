package OOP.Lab9;

public class TriangleClass {
    private double side1, side2, side3;
    public TriangleClass(double side1, double side2, double side3)throws IllegalTriangle{
            this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
                
                if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
                    throw new IllegalTriangle(side1, side2, side3);
                }
                
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
}

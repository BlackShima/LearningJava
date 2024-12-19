package OOP;

class Circle extends Shape{
    private double radius;

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*(Math.pow(radius,2));
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "Circle with radius: " + radius + ", which is a subclass of " +super.toString();
    }

    }
    class Rectangle extends Shape {
        private double length;
        private double width;
        private  String color;
        private boolean filled;

        public Rectangle(double length, double width, String color,boolean filled) {
            super(color, filled);
            this.length = length;
            this.width = width;
        }
        public Rectangle(){

        }
        public double getArea(){
            return width * length;
        }
        public double getPerimeter(){
            return (width+length)*2;
        }
        @Override
        public String toString(){
            return "Rectangle with width: " + width + " add length: "+ length+", which is subclass of "+super.toString();
        }
}

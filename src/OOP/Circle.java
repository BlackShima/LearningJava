package OOP;

class Circle {
    private double radius;
    private double Parameters;
    private double Area;

    public Circle(double radius, double Parameters, double Area) {
        this.radius = radius;
        this.Parameters = Parameters;
        this.Area = Area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getParameters() {
        return Parameters;
    }

    public void setParameters(double parameters) {
        Parameters = parameters;
    }
    public double getArea() {
        return Area;
    }
    public void setArea(double area) {
        Area = area;
    }
}

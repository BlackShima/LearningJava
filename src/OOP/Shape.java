package OOP;

public class Shape {
    private String color;
    private boolean filled;


    //Default constructor
    public Shape() {
        this("white", false); //Default color white and not filled
    }

    //Parameterized constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //Getter for the color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFill() {
        return filled;
    }

    public void setFill(boolean filled) {
        this.filled = filled;
    }

    //toString method

    public String toString() {
        return "Shape [color=" + color + ", filled=" + filled + "]";
    }
}

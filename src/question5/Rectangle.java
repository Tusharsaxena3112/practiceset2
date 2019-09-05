package question5;

public class Rectangle {
    private double length;
    private double breadth;
    private double area;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double length) {
        this.length = length;
        this.breadth = length;
    }

    public void Area() {
        area = length * breadth;
    }

    public String toString() {
        return "Area is:" + area;
    }
}

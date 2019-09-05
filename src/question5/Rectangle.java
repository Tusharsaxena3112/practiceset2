package question5;

public class Rectangle {
    private double length;
    private double breadth;

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
}

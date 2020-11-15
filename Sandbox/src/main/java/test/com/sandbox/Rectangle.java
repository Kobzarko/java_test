package test.com.sandbox;

public class Rectangle {
    public double side_a;
    public double side_b;

    public Rectangle(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public double area() {
        return this.side_a * this.side_b;
    }
}

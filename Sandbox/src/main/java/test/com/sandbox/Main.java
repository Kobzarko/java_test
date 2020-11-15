package test.com.sandbox;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello test");

        Square shape = new Square(5);

        System.out.println("Area of the square with side " + shape.l + " = " + shape.area());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of the rectangle with side " + rectangle.side_a + " and " + rectangle.side_b + " = " + rectangle.area());
    }

}


abstract class Shape {

    abstract void calculateArea();

    void displayMessage() {
        System.out.println("Calculating area of shape...");
    }
}

class Circle extends Shape {

    double radius = 5;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {

    double length = 10;
    double width = 5;

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.displayMessage();
        c.calculateArea();

        System.out.println();

        Rectangle r = new Rectangle();
        r.displayMessage();
        r.calculateArea();
    }
}
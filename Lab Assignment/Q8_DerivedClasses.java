class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }
}

public class Q8_DerivedClasses {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Area of Circle: " + cylinder.calculateArea());
        System.out.println("Volume of Cylinder: " + cylinder.calculateVolume());
    }
}

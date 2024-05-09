class Circle {
    private double radius;

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

class Box extends Rectangle {
    private double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calculateVolume() {
        return length * width * height;
    }
}

public class Q7_DerivedClasses {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Box box = new Box(5, 10, 3);
        System.out.println("Volume of Box: " + box.calculateVolume());
    }
}


/* 
 * 6)	Write a program to create a class CIRCLE with one field as radius, used to calculate the area of a Circle. Create another class RECTANGLE used to calculate the area of the rectangle which is a subclass of CIRCLE class. Use the concept of single inheritance such that the radius of circle class can be re-used as length in rectangle class. Take necessary data members and member functions for both the classes to solve this problem. All the data members are initialized through the constructors. Show the result by accessing the area method of both the classes through the objects of the rectangle class.
 */


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
    private double length;
    private double width;

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

public class Q6_Inheritance {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Reusing the radius of Circle as the length of Rectangle
        Rectangle rectangle = new Rectangle(circle.getRadius(), 10);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

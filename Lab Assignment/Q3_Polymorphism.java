import java.util.Scanner;

/* 
 3)	Write a Java program to find Area and Circle of different shapes using polymorphism concept.* 
 */





abstract class Shape {
    abstract double area();
    abstract double circumference();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double circumference() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double circumference() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double circumference() {
        return side1 + side2 + side3;
    }
}

public class Q3_Polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area of the circle: " + circle.area());
                    System.out.println("Circumference of the circle: " + circle.circumference());
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area of the rectangle: " + rectangle.area());
                    System.out.println("Circumference of the rectangle: " + rectangle.circumference());
                    break;

                case 3:
                    System.out.print("Enter the length of side 1 of the triangle: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter the length of side 2 of the triangle: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter the length of side 3 of the triangle: ");
                    double side3 = scanner.nextDouble();
                    Triangle triangle = new Triangle(side1, side2, side3);
                    System.out.println("Area of the triangle: " + triangle.area());
                    System.out.println("Circumference of the triangle: " + triangle.circumference());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
            System.out.println();
        } while (choice != 4);
        scanner.close();
    }
}

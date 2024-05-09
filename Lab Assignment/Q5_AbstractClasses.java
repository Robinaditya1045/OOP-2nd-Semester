abstract class Shape {
    abstract double getArea();
    abstract double getVolume();
}

class TwoDimensionalShape extends Shape {
    double side;

    TwoDimensionalShape(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getVolume() {
        return 0;
    }
}

class ThreeDimensionalShape extends Shape {
    double side;

    ThreeDimensionalShape(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return 4 * Math.PI * side * side;
    }

    @Override
    double getVolume() {
        return (4.0/3.0) * Math.PI * side * side * side;
    }
}

class Square extends TwoDimensionalShape {
    Square(double side) {
        super(side);
    }
}

class Circle extends TwoDimensionalShape {
    Circle(double radius) {
        super(radius);
    }

    @Override
    double getArea() {
        return Math.PI * side * side;
    }
}

class Cube extends ThreeDimensionalShape {
    Cube(double side) {
        super(side);
    }
}

class Sphere extends ThreeDimensionalShape {
    Sphere(double radius) {
        super(radius);
    }

    @Override
    double getArea() {
        return super.getArea();
    }
}

public class Q5_AbstractClasses {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area of Square: " + square.getArea());

        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.getArea());

        Cube cube = new Cube(5);
        System.out.println("Area of Cube: " + cube.getArea());
        System.out.println("Volume of Cube: " + cube.getVolume());

        Sphere sphere = new Sphere(5);
        System.out.println("Area of Sphere: " + sphere.getArea());
        System.out.println("Volume of Sphere: " + sphere.getVolume());
    }
}

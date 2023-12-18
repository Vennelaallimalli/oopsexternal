abstract class Shape {
    abstract double getArea();
    abstract double getVolume();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getVolume() {
        // Not applicable for 2D shapes, return 0 for simplicity
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        // Not applicable for 2D shapes, return 0 for simplicity
        return 0;
    }
}

class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return 6 * side * side;
    }

    @Override
    double getVolume() {
        return side * side * side;
    }
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(3);
        Cube cube = new Cube(4);
        Sphere sphere = new Sphere(2.5);

        displayAreaAndVolume(square);
        displayAreaAndVolume(circle);
        displayAreaAndVolume(cube);
        displayAreaAndVolume(sphere);
    }

    private static void displayAreaAndVolume(Shape shape) {
        System.out.println("Shape: " + shape.getClass().getSimpleName());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Volume: " + shape.getVolume());
        System.out.println();
    }
}

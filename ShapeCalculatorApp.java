mkdir shapes
// File: shapes/Square.java
package shapes;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}
// File: shapes/Triangle.java
package shapes;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        // Using Heron's formula for the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
// File: shapes/Circle.java
package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
// File: ShapeCalculatorApp.java
import shapes.Square;
import shapes.Triangle;
import shapes.Circle;

import java.util.Scanner;

public class ShapeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the side length of the square:");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                System.out.println("Area: " + square.calculateArea());
                System.out.println("Perimeter: " + square.calculatePerimeter());
                break;

            case 2:
                System.out.println("Enter the lengths of the three sides of the triangle:");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("Area: " + triangle.calculateArea());
                System.out.println("Perimeter: " + triangle.calculatePerimeter());
                break;

            case 3:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area: " + circle.calculateArea());
                System.out.println("Perimeter: " + circle.calculatePerimeter());
                break;

            default:
                System.out.println("Invalid choice.");
        }

        // Close the scanner
        scanner.close();
    }
}

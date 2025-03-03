import graphics.*; // Importing the graphics package
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle
        System.out.println("Enter length and width of the Rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + rect.area1());

        // Triangle
        System.out.println("\nEnter base and height of the Triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        Triangle tri = new Triangle(base, height);
        System.out.println("Area of Triangle: " + tri.area());

        // Square
        System.out.println("\nEnter side of the Square:");
        double side = scanner.nextDouble();
        Square square = new Square(side);
        System.out.println("Area of Square: " + square.area());

        // Circle
        System.out.println("\nEnter radius of the Circle:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.area());

        scanner.close();
    }
}


package com.example.androidbasics.JavaClasses.JavaOOPS;

// Interface for 2D Shapes
interface TwoDShape {
    void setLength(double length);
    void setBreadth(double breadth);
    double getLength();
    double getBreadth();
    void calculateArea();
    void calculatePerimeter();
}

// Interface for 3D Shapes
interface ThreeDShape {
    void setHeight(double height);
    double getHeight();
    void setRadius(double radius);
    double getRadius();
    void calculateVolume();
    void calculateSurfaceArea();
}

// Abstract class Shape
abstract class Shape {
    private static double area;
    private static double perimeter;
    private static double volume;

    public static double getArea() {
        return area;
    }

    public static void setArea(double area) {
        Shape.area = area;
    }

    public static double getPerimeter() {
        return perimeter;
    }

    public static void setPerimeter(double perimeter) {
        Shape.perimeter = perimeter;
    }

    public static double getVolume() {
        return volume;
    }

    public static void setVolume(double volume) {
        Shape.volume = volume;
    }
}

// Concrete class Rectangle
class RectangleShape extends Shape implements TwoDShape {
    private double length;
    private double breadth;

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getBreadth() {
        return breadth;
    }

    @Override
    public void calculateArea() {
        setArea(length * breadth);
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * (length + breadth));
    }
}

// Concrete class Square
class SquareShape extends Shape implements TwoDShape {
    private double side;

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public void setBreadth(double side) {
        // Square has equal sides, so setBreadth is not applicable
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getBreadth() {
        return side;
    }

    @Override
    public void calculateArea() {
        setArea(side * side);
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(4 * side);
    }
}

// Concrete class Circle
class CircleShape extends Shape implements TwoDShape {
    private double radius;

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setLength(double diameter) {
        // Not applicable for Circle
        // Instead, we can derive the radius from the diameter
        this.radius = diameter / 2;
    }

    @Override
    public void setBreadth(double radius) {
        // Not applicable for Circle
        // Setting the radius directly
        this.radius = radius;
    }

    @Override
    public double getLength() {
        // Diameter is twice the radius
        return 2 * radius;
    }

    @Override
    public double getBreadth() {
        return radius;
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI * radius * radius);
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * Math.PI * radius);
    }
}


// Concrete class Triangle
class Triangle extends Shape implements TwoDShape {
    private double side1;
    private double side2;
    private double side3;

    @Override
    public void setLength(double side1) {
        this.side1 = side1;
    }

    @Override
    public void setBreadth(double side2) {
        this.side2 = side2;
    }

    // Setter for Height
    public void setHeight(double side3) {
        this.side3 = side3;
    }

    // Getter for Height
    public double getHeight() {
        return side3;
    }

    @Override
    public double getLength() {
        return side1;
    }

    @Override
    public double getBreadth() {
        return side2;
    }

    @Override
    public void calculateArea() {
        // Heron's formula for the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        setArea(Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(side1 + side2 + side3);
    }
}

// Concrete class Cube
class Cube extends Shape implements ThreeDShape {
    private double side;

    @Override
    public void setHeight(double side) {
        this.side = side;
    }

    @Override
    public double getHeight() {
        return side;
    }

    @Override
    public void setRadius(double radius) {
        // Not applicable for Cube
    }

    @Override
    public double getRadius() {
        // Not applicable for Cube
        return 0;
    }

    @Override
    public void calculateVolume() {
        setVolume(side * side * side);
    }

    @Override
    public void calculateSurfaceArea() {
        setArea(6 * side * side);
    }
}

// Concrete class Cylinder
class Cylinder extends Shape implements ThreeDShape {
    private double radius;
    private double height;

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void calculateVolume() {
        setVolume(Math.PI * radius * radius * height);
    }

    @Override
    public void calculateSurfaceArea() {
        setArea(2 * Math.PI * radius * (radius + height));
    }
}

// Concrete class Cone
class Cone extends Shape implements ThreeDShape {
    private double radius;
    private double height;

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void calculateVolume() {
        setVolume(Math.PI * radius * radius * height / 3);
    }

    @Override
    public void calculateSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        setArea(Math.PI * radius * (radius + slantHeight));
    }
}

// Concrete class Sphere
class Sphere extends Shape implements ThreeDShape {
    private double radius;

    @Override
    public void setHeight(double radius) {
        // Not applicable for Sphere
    }

    @Override
    public double getHeight() {
        // Not applicable for Sphere
        return 0;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void calculateVolume() {
        setVolume(4.0 / 3.0 * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public void calculateSurfaceArea() {
        setArea(4 * Math.PI * Math.pow(radius, 2));
    }
}

// Main Program ShapeProgram
public class ShapeProgram {
    public static void main(String[] args) {

        RectangleShape rectangle = new RectangleShape();
        rectangle.setLength(4.0);
        rectangle.setBreadth(6.0);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println("RectangleShape Area: " + Shape.getArea());
        System.out.println("RectangleShape Perimeter: " + Shape.getPerimeter());
        System.out.println("-----------------------------");

        SquareShape square = new SquareShape();
        square.setLength(5.0);
        square.calculateArea();
        square.calculatePerimeter();
        System.out.println("SquareShape Area: " + Shape.getArea());
        System.out.println("SquareShape Perimeter: " + Shape.getPerimeter());
        System.out.println("-----------------------------");

        CircleShape circle = new CircleShape();
        circle.setRadius(3.0);
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println("CircleShape Area: " + Shape.getArea());
        System.out.println("Perimeter: " + Shape.getPerimeter());
        System.out.println("-----------------------------");

        Triangle triangle = new Triangle();
        triangle.setLength(3.0);
        triangle.setBreadth(4.0);
        triangle.setHeight(5.0);
        triangle.calculateArea();
        triangle.calculatePerimeter();
        System.out.println("Triangle Area: " + Shape.getArea());
        System.out.println("Triangle Perimeter: " + Shape.getPerimeter());
        System.out.println("-----------------------------");

        Cube cube = new Cube();
        cube.setHeight(4.0);
        cube.calculateVolume();
        cube.calculateSurfaceArea();
        System.out.println("Cube Volume: " + Shape.getVolume());
        System.out.println("Cube Surface Area: " + Shape.getArea());
        System.out.println("-----------------------------");

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.0);
        cylinder.setHeight(5.0);
        cylinder.calculateVolume();
        cylinder.calculateSurfaceArea();
        System.out.println("Cylinder Volume: " + Shape.getVolume());
        System.out.println("Cylinder Surface Area: " + Shape.getArea());
        System.out.println("-----------------------------");

        Cone cone = new Cone();
        cone.setRadius(3.0);
        cone.setHeight(6.0);
        cone.calculateVolume();
        cone.calculateSurfaceArea();
        System.out.println("Cone Volume: " + Shape.getVolume());
        System.out.println("Cone Surface Area: " + Shape.getArea());
        System.out.println("-----------------------------");

        Sphere sphere = new Sphere();
        sphere.setRadius(2.0);
        sphere.calculateVolume();
        sphere.calculateSurfaceArea();
        System.out.println("Sphere Volume: " + Shape.getVolume());
        System.out.println("Sphere Surface Area: " + Shape.getArea());
    }
}


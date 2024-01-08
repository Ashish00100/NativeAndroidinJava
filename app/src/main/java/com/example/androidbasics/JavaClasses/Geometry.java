package com.example.androidbasics.JavaClasses;

import java.util.ArrayList;

// Interface for 2D Shapes
interface TwoDimShape {
    void calculateArea();
    void calculatePerimeter();
    int getNumberOfSides();
}

// Interface for 3D Shapes
interface ThreeDimShape {
    void calculateVolume();
    void calculateSurfaceArea();
}

// Abstract class Shapess
abstract class Shapess {
    private String name;

    public Shapess(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public abstract void displayShapeDetails();
}

// Concrete class RectangleSha
class RectangleSha extends Shapess implements TwoDimShape {
    private double length;
    private double breadth;

    // Constructor
    public RectangleSha(double length, double breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area: " + (length * breadth));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + breadth)));
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }

    @Override
    public void displayShapeDetails() {
        System.out.println("Shape: " + getName());
        System.out.println("Number of Sides: " + getNumberOfSides());
        calculateArea();
        calculatePerimeter();
        System.out.println("-----------------------------");
    }
}

// Concrete class SphereSha
class SphereSha extends Shapess implements ThreeDimShape {
    private double radius;

    // Constructor
    public SphereSha(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume: " + ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)));
    }

    @Override
    public void calculateSurfaceArea() {
        System.out.println("Surface Area: " + (4 * Math.PI * Math.pow(radius, 2)));
    }

    @Override
    public void displayShapeDetails() {
        System.out.println("Shape: " + getName());
        calculateVolume();
        calculateSurfaceArea();
        System.out.println("-----------------------------");
    }
}

// Main Program Geometry
public class Geometry {
    public static void main(String[] args) {

        ArrayList<Shapess> shapes = new ArrayList<>();
        
        shapes.add(new RectangleSha(5.0, 3.0));
        shapes.add(new SphereSha(2.5));

        // Displaying details of each shape
        for (Shapess shape : shapes) {
            shape.displayShapeDetails();
        }
    }
}

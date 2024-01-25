package com.example.androidbasics.JavaClasses.JavaOOPS;

// Interface for Shapes
interface Shapes {
    void calculateArea();
    void calculatePerimeter();
    void printDetails();
}

// Concrete class Rectangle
class Rectangle implements Shapes {
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle area : "+(length*breadth));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Rectangle perimeter : "+ 2 * (length+breadth));
    }

    @Override
    public void printDetails() {
        System.out.println("=======> Rectangle");
        calculateArea();
        calculatePerimeter();

    }
}

// Concrete class Square
class Square implements Shapes {
    int side;

    Square(int side){
        this.side=side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Square area : "+(side * side));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Square perimeter : "+ 4 * (side));
    }

    @Override
    public void printDetails() {
        System.out.println("=======> Square");
        calculateArea();
        calculatePerimeter();

    }
}

// Concrete class Circle
class Circle implements Shapes {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle area : "+(3.14 * radius * radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Circle perimeter : "+ 2 * 3.14 * radius);
    }

    @Override
    public void printDetails() {
        System.out.println("=======> Circle");
        calculateArea();
        calculatePerimeter();

    }
}

// main Program
public class MockTestShapeProgram {
    public static void main(String[] args) {
        Shapes shapes[] = new Shapes[5];

        shapes[0] = new Rectangle(12, 17);
        shapes[1] = new Square(25);
        shapes[2] = new Circle(3.9);
        shapes[3] = new Rectangle(77, 35);
        shapes[4] = new Circle(7.5);

        for (Shapes shape : shapes) {
//            System.out.println();
            shape.printDetails();
        }
    }
}

package geometricFigures;

import java.util.Scanner;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public Circle() {
        super("Circle");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return  super.toString() + ": radius is " + radius;
    }

    @Override
    public double computeArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public double computerPerimeter() {
        return 2.0 * 3.14 * radius;
    }

    @Override
    public void readShapeDate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius for a Circle: ");
        radius = in.nextDouble();
    }
}

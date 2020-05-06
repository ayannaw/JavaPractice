package geometricFigures;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double width, height;
    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        super("Rectangle");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double computeArea() {
        return (width*height);
    }

    @Override
    public double computerPerimeter() {
        return 2*(width+height);
    }

    @Override
    public void readShapeDate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the width of the Rectangle");
        width = in.nextDouble();
        System.out.println("Enter the height of the Rectangle");
        height = in.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + ": width is " + width +
                ", height is " + height;
    }
}

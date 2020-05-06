package geometricFigures;

import java.util.Scanner;

public class RtTriangle extends Shape {
    private double base, height;
    public RtTriangle(double base, double height) {
        super("Right Triangle");
        this.base = base;
        this.height = height;
    }

    public RtTriangle() {
        super("Right Triangle");
    }

    @Override
    public double computeArea() {
        return (base * height) / 2;
    }

    @Override
    public double computerPerimeter() {
        return (base + height + (Math.sqrt(Math.pow(base,2) + Math.pow(height,2))));
    }

    @Override
    public void readShapeDate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base for a Right Triangle: ");
        base = in.nextDouble();
        System.out.println("Enter the height for a Right Triangle:");
        height = in.nextDouble();
    }
}

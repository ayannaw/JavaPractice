package geometricFigures;

import java.util.Scanner;

public class ComputerAreaAndPerimeter {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Shape myShape;
        double perimeter, area;
        myShape = getShape();
        if (myShape == null) {
            System.out.println("Try Again");
            myShape = getShape();
        }
        
    }

    public static Shape getShape() {
        System.out.println("Enter C for Circle, R for Rectangle, T for Triangle");
        String figureChoice = in.next();
        if (figureChoice.equalsIgnoreCase("C")) {
            return new Circle();
        }
        else if (figureChoice.equalsIgnoreCase("R")) {
            return new Rectangle();
        }
        else if (figureChoice.equalsIgnoreCase("T")) {
            return new RtTriangle();
        }
        else {
            return null;
        }
    }
}

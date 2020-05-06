package geometricFigures;

public abstract class Shape {
    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String toString() {
        return "Shape is a: " + shapeName;
    }

    //abstract methods
    public abstract double computeArea();
    public abstract double computerPerimeter();
    public abstract void readShapeDate();
}

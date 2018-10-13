/**
 * Represents a Circle Shape.
 */
public class Circle extends Shape {

    private int radius;
    private Point center;

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void move(Point p) {

    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }
}
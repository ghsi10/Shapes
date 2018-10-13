/**
 * Represents a Circle Shape.
 */
public class Circle extends Shape {

    private int radius;
    private Point center;

    public Circle(Point center, int radius) {
        if (radius <= 0)
            throw new RuntimeException("Radios can't be 0 or negative!");
        this.center = Point.of(center);
        this.radius = radius;
    }

    public Circle(Circle c) {
        this.center = Point.of(c.center);
        this.radius = c.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void move(Point p) {
        center.move(p);
    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }
}
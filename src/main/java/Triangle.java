public class Triangle extends Polygon {

    public Triangle(Point[] points) {
        super(points);
    }

    @Override
    public double getPerimeter() {
        return points[0].distance(points[1]) + points[1].distance(points[2]) + points[2].distance(points[0]);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void move(Point p) {

    }
}
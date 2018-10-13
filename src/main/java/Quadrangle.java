
public class Quadrangle extends Polygon {

    public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
        super(new Point[]{new Point(p1), new Point(p2), new Point(p3), new Point(p4)});
    }

    @Override
    public double getArea() {
        return new Triangle(points[0], points[1], points[2]).getArea()
                + new Triangle(points[0], points[2], points[3]).getArea();
    }
}
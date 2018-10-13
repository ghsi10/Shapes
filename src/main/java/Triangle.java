public class Triangle extends Polygon {

    public Triangle(Point p1, Point p2, Point p3) {
        super(new Point[]{new Point(p1), new Point(p2), new Point(p3)});
    }

    @Override
    public double getPerimeter() {
        return points[0].distance(points[1]) + points[1].distance(points[2]) + points[2].distance(points[0]);
    }

    @Override
    public double getArea() {
        double perimeter = getPerimeter();
        double ans = perimeter / 2;
        for (int i = 0; i < getSides().size(); i++) {
            ans *= (perimeter / 2 - getSides().get(i));
        }
        return Math.sqrt(ans);
    }
}
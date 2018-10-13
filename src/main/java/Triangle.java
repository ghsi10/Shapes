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
        double perimeter = getPerimeter();
        double ans = perimeter / 2;
        for (int i = 0; i < getSides().size(); i++) {
            ans *= (perimeter / 2 - getSides().get(i));
        }
        return Math.sqrt(ans);
    }
}
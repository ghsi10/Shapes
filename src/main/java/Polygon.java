import java.util.ArrayList;
import java.util.List;

public abstract class Polygon extends Shape {

    protected Point[] points;

    public Polygon(Point[] points) {
        this.points = points.clone();
    }

    public Point[] getPoints() {
        return points.clone();
    }

    public List<Double> getSides() {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < points.length; i++)
            list.add(points[i].distance(points[(i + 1) % points.length]));
        return list;
    }

    public void move(Point p) {
        for (Point point : points)
            point.move(p);
    }

    public double getPerimeter() {
        return getSides().stream().reduce(0.0, (a, b) -> a + b);
    }
}
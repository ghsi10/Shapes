public abstract class Polygon extends Shape {

    protected Point[] points;

    public Polygon(Point[] points) {
        this.points = points.clone();
    }

    public Point[] getPoints() {
        return points.clone();
    }
}
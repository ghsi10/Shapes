import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void setup() {
        Point[] points = new Point[4];
        points[0] = new Point(0, 3);
        points[1] = new Point(4, 0);
        points[2] = new Point(4, 3);
        triangle = new Triangle(points);
    }

    @Test
    public void getPoints() {
        Point[] points = triangle.getPoints();
        assertEquals(points[0], new Point(0, 3));
        assertEquals(points[1], new Point(4, 0));
        assertEquals(points[2], new Point(4, 3));
    }

    @Test
    public void getPerimeter() {
        assertEquals(triangle.getPerimeter(), 12, 0.01);
    }

    @Test
    public void getArea() {
        assertEquals(triangle.getArea(), 6, 0.01);
    }
}

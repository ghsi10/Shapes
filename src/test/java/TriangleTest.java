import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void setup() {
        Point[] points = new Point[3];
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

    @Test
    public void getSides() {
        List<Double> sides = triangle.getSides();
        assertEquals(sides.size(), 3);
        assertTrue(sides.contains(3.0));
        assertTrue(sides.contains(4.0));
        assertTrue(sides.contains(5.0));
    }

    @Test
    public void move() {
        triangle.move(new Point(1, 2));
        Point[] p = triangle.getPoints();
        assertEquals(p[0], new Point(1, 5));
        assertEquals(p[1], new Point(5, 2));
        assertEquals(p[2], new Point(5, 5));
    }
}

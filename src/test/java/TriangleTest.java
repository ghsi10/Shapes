import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void setup() {
        triangle = new Triangle(Point.of(0, 3), Point.of(4, 0), Point.of(4, 3));
    }

    @Test
    public void getPoints() {
        Point[] points = triangle.getPoints();
        assertEquals(points[0], Point.of(0, 3));
        assertEquals(points[1], Point.of(4, 0));
        assertEquals(points[2], Point.of(4, 3));
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
        triangle.move(Point.of(1, 2));
        Point[] p = triangle.getPoints();
        assertEquals(p[0], Point.of(1, 5));
        assertEquals(p[1], Point.of(5, 2));
        assertEquals(p[2], Point.of(5, 5));
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    private Point point;

    @Before
    public void setup() {
        point = new Point(5, 8);
    }

    @Test
    public void copyConstrictor() {
        Point p = new Point(point);
        assertEquals(p.getX(), 5);
        assertEquals(p.getY(), 8);
    }

    @Test
    public void moveByCoords() {
        point.move(2, 1);
        assertEquals(point.getX(), 7);
        assertEquals(point.getY(), 9);
    }

    @Test
    public void moveByPoint() {
        point.move(new Point(3, 2));
        assertEquals(point.getX(), 8);
        assertEquals(point.getY(), 10);
    }

    @Test
    public void distance() {
        assertEquals(point.distance(new Point(5, 10)), 2.0, 0.001);
    }

    @Test
    public void notEquals() {
        Point p = new Point(1, 2);
        assertNotEquals(point, p);
    }

    @Test
    public void nullEquals() {
        assertNotEquals(null, point);
    }

    @Test
    public void otherObjectEquals() {
        assertNotEquals(new Object(), point);
    }

    @Test
    public void equals() {
        Point p = new Point(5, 8);
        assertEquals(point, p);
    }
}

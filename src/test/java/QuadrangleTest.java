import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadrangleTest {

    private Quadrangle quadrangle;

    @Before
    public void setup() {
        quadrangle = new Quadrangle(Point.of(0, 0), Point.of(3, 0), Point.of(3, 4), Point.of(0, 4));
    }

    @Test
    public void getArea() {
        assertEquals(quadrangle.getArea(), 12, 0.01);
    }

    @Test
    public void getPerimeter() {
        assertEquals(quadrangle.getPerimeter(), 14, 0.01);
    }
}

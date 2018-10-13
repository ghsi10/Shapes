import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PolygonTest {

    private Quadrangle quadrangle;

    @Before
    public void setup() {
        quadrangle = new Quadrangle(new Point(0, 0), new Point(3, 0), new Point(3, 4), new Point(0, 4));
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

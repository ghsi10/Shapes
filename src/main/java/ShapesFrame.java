import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class ShapesFrame extends Frame {

    private List<Shape> shapes;

    public ShapesFrame(List<Shape> shapes) {
        this.shapes = shapes;
        setTitle("Assignment 5 tester app");
        setSize(300, 300);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowevent) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        for (Shape shape : shapes) {
            g.setColor(getKnownColor());
            if (shape instanceof Polygon) {
                Polygon polygon = (Polygon) shape;
                Point[] points = polygon.getPoints();
                int[] xPoints = new int[points.length];
                int[] yPoints = new int[points.length];
                for (int i = 0; i < points.length; i++) {
                    xPoints[i] = points[i].getX();
                    yPoints[i] = points[i].getY();
                }
                g.fillPolygon(xPoints, yPoints, points.length);
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                int xCircle = circle.getCenter().getX();
                int yCircle = circle.getCenter().getY();
                int rCircle = circle.getRadius();
                g.fillOval(xCircle - rCircle, yCircle - rCircle, rCircle * 2, rCircle * 2);
            } else {
                throw new UnsupportedOperationException("This type of shape is not supported graphically.");
            }
        }
    }

    private Color getKnownColor() {
        switch ((int) (Math.random() * 13)) {
            case 0:
                return Color.YELLOW;
            case 1:
                return Color.BLUE;
            case 2:
                return Color.CYAN;
            case 3:
                return Color.DARK_GRAY;
            case 4:
                return Color.GRAY;
            case 5:
                return Color.GREEN;
            case 6:
                return Color.LIGHT_GRAY;
            case 7:
                return Color.MAGENTA;
            case 8:
                return Color.ORANGE;
            case 9:
                return Color.PINK;
            case 10:
                return Color.RED;
            case 11:
                return Color.WHITE;
            default:
                return Color.BLACK;
        }
    }
}
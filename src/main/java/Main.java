import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ShapesFrame frame = new ShapesFrame(addShapes());
        frame.setVisible(true);
    }

    private static List<Shape> addShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(Point.of(122, 145), Point.of(133, 146), Point.of(123, 63)));
        shapes.add(new Triangle(Point.of(122, 144), Point.of(129, 143), Point.of(166, 71)));
        shapes.add(new Triangle(Point.of(122, 144), Point.of(131, 145), Point.of(191, 91)));
        shapes.add(new Triangle(Point.of(132, 143), Point.of(124, 143), Point.of(85, 79)));
        shapes.add(new Triangle(Point.of(132, 143), Point.of(123, 143), Point.of(65, 101)));
        shapes.add(new Triangle(Point.of(125, 142), Point.of(99, 172), Point.of(145, 174)));
        shapes.add(new Triangle(Point.of(120, 169), Point.of(98, 220), Point.of(138, 222)));
        shapes.add(new Triangle(Point.of(107, 218), Point.of(98, 217), Point.of(82, 274)));
        shapes.add(new Triangle(Point.of(86, 262), Point.of(83, 271), Point.of(66, 258)));
        shapes.add(new Triangle(Point.of(125, 218), Point.of(135, 217), Point.of(144, 271)));
        shapes.add(new Triangle(Point.of(145, 271), Point.of(141, 258), Point.of(152, 257)));
        shapes.add(new Triangle(Point.of(135, 171), Point.of(142, 171), Point.of(176, 202)));
        shapes.add(new Triangle(Point.of(169, 194), Point.of(173, 199), Point.of(184, 174)));
        shapes.add(new Triangle(Point.of(101, 167), Point.of(106, 163), Point.of(50, 144)));
        shapes.add(new Triangle(Point.of(54, 146), Point.of(65, 148), Point.of(58, 130)));
        shapes.add(new Triangle(Point.of(162, 269), Point.of(188, 270), Point.of(176, 215)));
        shapes.add(new Triangle(Point.of(67, 268), Point.of(47, 269), Point.of(51, 207)));
        shapes.add(new Quadrangle(Point.of(67, 268), Point.of(54, 146), Point.of(47, 269), Point.of(51, 277)));
        shapes.add(new Quadrangle(Point.of(17, 168), Point.of(24, 246), Point.of(68, 269), Point.of(45, 207)));
        shapes.add(new Circle(Point.of(250, 40), 30));
        return shapes;
    }
}

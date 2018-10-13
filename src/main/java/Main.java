import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ShapesFrame frame = new ShapesFrame(addShapes());
        frame.setVisible(true);
    }

    private static List<Shape> addShapes() {
        List<Shape> shapes = new ArrayList<>();
//        shapes.add(new Triangle(new Point(122, 145), new Point(133, 146), new Point(123, 63)));
//        shapes.add(new Triangle(new Point(122, 144), new Point(129, 143), new Point(166, 71)));
//        shapes.add(new Triangle(new Point(122, 144), new Point(131, 145), new Point(191, 91)));
//        shapes.add(new Triangle(new Point(132, 143), new Point(124, 143), new Point(85, 79)));
//        shapes.add(new Triangle(new Point(132, 143), new Point(123, 143), new Point(65, 101)));
//        shapes.add(new Triangle(new Point(125, 142), new Point(99, 172), new Point(145, 174)));
//        shapes.add(new Triangle(new Point(120, 169), new Point(98, 220), new Point(138, 222)));
//        shapes.add(new Triangle(new Point(107, 218), new Point(98, 217), new Point(82, 274)));
//        shapes.add(new Triangle(new Point(86, 262), new Point(83, 271), new Point(66, 258)));
//        shapes.add(new Triangle(new Point(125, 218), new Point(135, 217), new Point(144, 271)));
//        shapes.add(new Triangle(new Point(145, 271), new Point(141, 258), new Point(152, 257)));
//        shapes.add(new Triangle(new Point(135, 171), new Point(142, 171), new Point(176, 202)));
//        shapes.add(new Triangle(new Point(169, 194), new Point(173, 199), new Point(184, 174)));
//        shapes.add(new Triangle(new Point(101, 167), new Point(106, 163), new Point(50, 144)));
//        shapes.add(new Triangle(new Point(54, 146), new Point(65, 148), new Point(58, 130)));
//        shapes.add(new Triangle(new Point(162, 269), new Point(188, 270), new Point(176, 215)));
//        shapes.add(new Triangle(new Point(67, 268), new Point(47, 269), new Point(51, 207)));
//        shapes.add(new Quadrangle(new Point(67, 268), new Point(54, 146), new Point(47, 269), new Point(51, 277)));
//        shapes.add(new Quadrangle(new Point(17, 168), new Point(24, 246), new Point(68, 269), new Point(45, 207)));
//        shapes.add(new Circle(new Point(250, 40), 30));
        return shapes;
    }
}

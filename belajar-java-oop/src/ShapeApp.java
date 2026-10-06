public class ShapeApp {
    static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());

        var rectangle = new Rectengle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory1 = new SquareFactory(5);
        Shape2D shape2D1 = factory1.create2D();
        Shape3D shape3D1 = factory1.create3D();

        System.out.println(shape2D1);
        System.out.println(shape3D1);

        ShapeFactory factory2 = new CircleFactory(1);
        Shape2D shape2D2 = factory2.create2D();
        Shape3D shape3D2 = factory2.create3D();
        System.out.println(shape2D2);
        System.out.println(shape3D2);
    }
}

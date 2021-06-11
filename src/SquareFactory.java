public class SquareFactory implements ShapeFactory {
    public class Square extends Shape2D {
        private double a;

        public Square(double a) {
            this.a = a;
        }
        @Override
        public double area() {
            return a * a;
        }
        @Override
        public double perimeter() {
            return 4 * a;
        }
    }

    public class Cube extends Shape3D {
        private double a;

        public Cube(double a) {
            this.a = a;
        }
        @Override
        public double area() {
            return 6 * a * a;
        }
        @Override
        public double volume() {
            return Math.pow(a, 3);
        }
    }

    private double a;
    public SquareFactory(double a) {
        this.a = a;
    }
    @Override
    public Square create2D() {
        return new Square(a);
    }

    @Override
    public Cube create3D() {
        return new Cube(a);
    }
}

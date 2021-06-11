public class CircleFactory implements ShapeFactory {
    public class Circle extends Shape2D {
        private double radius;

        public Circle(double r) {
            radius = r;
        }
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public class Ball extends Shape3D {
        private double radius;

        public Ball(double r) {
            radius = r;
        }
        @Override
        public double area() {
            return 4 * Math.PI * Math.pow(radius, 2);
        }
        @Override
        public double volume() {
            return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
        }
    }

    private double radius;
    public CircleFactory(double radius) {
        this.radius = radius;
    }
    @Override
    public Circle create2D() {
        return new Circle(radius);
    }

    @Override
    public Ball create3D() {
        return new Ball(radius);
    }
}

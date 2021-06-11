public abstract class Shape2D {
    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Area: " + area() + ", perimeter: " + perimeter();
    }
}

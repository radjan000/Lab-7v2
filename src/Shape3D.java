public abstract class Shape3D {
    public abstract double area();
    public abstract double volume();

    @Override
    public String toString() {
        return "Area: " + area() + ", volume: " + volume();
    }
}

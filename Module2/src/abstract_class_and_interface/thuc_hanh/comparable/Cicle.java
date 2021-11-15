package abstract_class_and_interface.thuc_hanh.comparable;

public class Cicle {
    private double radius ;

    public Cicle(double radius) {
        this.radius = radius;
    }

    public Cicle(double radius, String color, boolean filled) {

    }

    public Cicle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }


}

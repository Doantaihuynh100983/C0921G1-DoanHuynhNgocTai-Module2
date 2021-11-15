package abstract_class_and_interface.thuc_hanh.Comparator;

public class Cicle {
    private double radius ;

    public Cicle(double radius) {
        this.radius = radius;
    }


    public Cicle() {

    }

    public Cicle(double v, String indigo, boolean b) {
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

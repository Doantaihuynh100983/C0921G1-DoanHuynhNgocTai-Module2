package abstract_class_and_interface.bai_tap.colorable;

public class cirle  extends HinhHoc{
    private double radius ;

    public cirle(double radius) {
        this.radius = radius;
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

    @Override
    public double getS() {
        return Math.PI* Math.pow(getRadius(),2);
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides.");
    }
}

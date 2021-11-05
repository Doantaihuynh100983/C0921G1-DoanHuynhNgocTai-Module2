package access_modifier.bai_tap.circle;

public class Circle {
    private double radius = 5 ;
    private  String color = "red";

    public Circle() {

    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return  this.radius*this.radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
}

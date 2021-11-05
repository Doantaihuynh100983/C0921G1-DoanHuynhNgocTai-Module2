package inheritance.bai_tap.bai4_shape;

public class Triangle  extends Shape{
    protected  String color ;

    public Triangle(double side1, double side2, double side3 , String color) {
        super(side1, side2, side3);
        this.color = color;

    }
    public double getArea() {
        double S = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(S * (S - this.side1) * (S - this.side2) * (S - this.side3));

    }
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;

    }
    public boolean sosanh(){
        if ((this.side1 + this.side2) > this.side3
                && (this.side1+this.side3)> this.side2
                && (this.side3 + this.side2) > this.side1) {
            return true;

        }
        return false;
    }
    @Override
    public String toString() {
        if (!sosanh()){
            return "Bạn nhập vào không phải tam giác !!!";
        }
            return
                    "color= '" + this.color + '\'' +
                            ", side1= " + this.side1 +
                            ", side2= " + this.side2 +
                            ", side3= " + this.side3  +
                            ", Chu Vi = " + this.getPerimeter() +
                            ", Diện Tích = " + this.getArea();



    }
}

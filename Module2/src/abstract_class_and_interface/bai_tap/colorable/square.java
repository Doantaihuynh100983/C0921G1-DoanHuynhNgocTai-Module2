package abstract_class_and_interface.bai_tap.colorable;

public class square extends HinhHoc{
    private double canh ;

    public square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }



    @Override
    public String toString() {
        return "Square{" +
                "canh=" + canh +
                '}';
    }

    @Override
    public double getS() {
        return   Math.pow(canh ,2);
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides.");
    }
}

package abstract_class_and_interface.bai_tap.resizeable;

public class Square extends GraphicObject{
    private double canh ;

    public Square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public void resize(double percent) {

        setCanh(getCanh() * (percent*100)/100);
    }

    @Override
    public double getArena() {
        return   Math.pow(canh ,2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "canh=" + canh +
                '}';
    }
}

package abstract_class_and_interface.bai_tap.colorable;

public class rectanggle  extends HinhHoc{
    private double chieuDai ;
    private double chieuRong ;


    public rectanggle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }

    @Override
    public double getS() {
        return getChieuDai() * getChieuRong();
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides.");
    }
}

package baitap_anhchanhgiao.models;

public class XeTai  extends PhuongTien{

    private double trongTai;

    public XeTai() {

    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);

        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return  getBienKiemSoat() + "\t" +  getTenHangSanXuat() +"\t" + "\t" +getNamSanXuat()
                + "\t" + "\t"  +getChuSoHuu() + "\t" +getTrongTai() ;

    }
}

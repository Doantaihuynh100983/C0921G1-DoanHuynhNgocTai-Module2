package baitap_anhchanhgiao.models;

public class XeMay extends PhuongTien {

    private String congSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);

        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return getBienKiemSoat()+ "\t"  + getTenHangSanXuat()+ "\t"  + getNamSanXuat() + "\t" + getChuSoHuu() + "\t" + getCongSuat() ;
    }
}

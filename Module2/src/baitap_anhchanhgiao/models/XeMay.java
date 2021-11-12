package baitap_anhchanhgiao.models;

public class XeMay extends PhuongTien {
    private static int idTemp = 1;
    private int id;
    private String congSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.id = idTemp++;
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
        return id + "\t" +getBienKiemSoat()+ "\t"  + getTenHangSanXuat()+ "\t"  + getNamSanXuat() + "\t" + getChuSoHuu() + "\t" + getCongSuat() ;
    }
}

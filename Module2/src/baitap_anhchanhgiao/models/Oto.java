package baitap_anhchanhgiao.models;

public class Oto extends PhuongTien{
    private static int idTemp = 1;
    private int id;
    private int soChoNgoi;
    private String kieuXe;

    public Oto() {
    }

    public Oto(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.id = idTemp++;
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {

        return  id + "\t" +getBienKiemSoat()+ "\t" + getTenHangSanXuat()+ "\t" + getNamSanXuat()+ "\t" + getChuSoHuu()+ "\t" + getSoChoNgoi()+ "\t" + getKieuXe() ;

    }
}

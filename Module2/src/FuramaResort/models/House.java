package FuramaResort.models;

public class House  extends Facility{
    private String tieuChuanPhong;
    private int soTang;


    public House(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiThueToiDa,
                 String kieuThue, String tieuChuanPhong, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House() {
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return  "HOUSE : "+ getTenDichVu() +"\t" +getDienTichSuDung()+"\t" +getChiPhiThue()+"\t" +getSoLuongNguoiThueToiDa()+"\t"  +
                getKieuThue() +"\t" + tieuChuanPhong  +"\t"  + soTang ;
    }
}

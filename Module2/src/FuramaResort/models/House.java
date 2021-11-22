package FuramaResort.models;

import java.util.Objects;

public class House extends Facility {
    private String tieuChuanPhong;
    private int soTang;


    public House(String maDichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue,
                 int soLuongNguoiThueToiDa, String kieuThue, String tieuChuanPhong, int soTang) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue);
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
        return "HOUSE : " + getMaDichVu()+"\t" + getTenDichVu() + "\t" + getDienTichSuDung() + "\t" + getChiPhiThue() + "\t" + getSoLuongNguoiThueToiDa() + "\t" +
                getKieuThue() + "\t" + tieuChuanPhong + "\t" + soTang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return getTenDichVu().equals(house.getTenDichVu())
                && Double.compare(house.getDienTichSuDung(), getDienTichSuDung()) == 0
                && Double.compare(house.getChiPhiThue(), getChiPhiThue()) == 0
                && house.getSoLuongNguoiThueToiDa() == getSoLuongNguoiThueToiDa()
                && getKieuThue().equals(house.getKieuThue())
                && soTang == house.soTang &&
                tieuChuanPhong.equals(house.tieuChuanPhong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTenDichVu(), getDienTichSuDung(), getChiPhiThue(), getSoLuongNguoiThueToiDa(),
                getKieuThue(), tieuChuanPhong, soTang);
    }
}

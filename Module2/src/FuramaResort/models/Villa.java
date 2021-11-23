package FuramaResort.models;

import FuramaResort.controllers.FuramaController;

import java.util.Objects;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    private int soTang;

    public Villa() {
    }

    public Villa(String maDichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiThueToiDa,
                 String kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }


    @Override
    public String toString() {
        return "VILLA : "+ getMaDichVu()+"\t" + getTenDichVu() + "\t" + getDienTichSuDung() + "\t" + getChiPhiThue() + "\t" + getSoLuongNguoiThueToiDa() + "\t" +
                getKieuThue() + "\t" + tieuChuanPhong + "\t" + dienTichHoBoi + "\t" + soTang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villa villa = (Villa) o;
        return   getMaDichVu().equals(villa.getMaDichVu())
                && getTenDichVu().equals(villa.getTenDichVu())
                && Double.compare(villa.getDienTichSuDung(), getDienTichSuDung()) == 0
                && Double.compare(villa.getChiPhiThue(), getChiPhiThue()) == 0
                && villa.getSoLuongNguoiThueToiDa() == getSoLuongNguoiThueToiDa()
                && getKieuThue().equals(villa.getKieuThue())
                && Double.compare(villa.dienTichHoBoi, dienTichHoBoi) == 0
                && soTang == villa.soTang
                && tieuChuanPhong.equals(villa.tieuChuanPhong);
    }

    @Override
    public int hashCode() {
        return Objects.hash( getMaDichVu(),getTenDichVu(), getDienTichSuDung(), getChiPhiThue(), getSoLuongNguoiThueToiDa(),
                getKieuThue(), tieuChuanPhong, dienTichHoBoi, soTang);
    }


}

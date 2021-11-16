package bai_lam_them_anhChanh_giao_2.models;

import quan_ly_ngan_hang.servcie.servcieimpl.NganHang;

public abstract class QuanLyTienDien {
    private String maKhachHang ;
    private String hoTen;

    public QuanLyTienDien() {
    }

    public QuanLyTienDien(String maKhachHang, String hoTen) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return "QuanLyTienDien{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
}

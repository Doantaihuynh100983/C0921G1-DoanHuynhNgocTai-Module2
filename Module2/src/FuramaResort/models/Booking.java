package FuramaResort.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Booking {
    private String maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String maKhachHang;
    private String tenDichVu;
    private String loaiDichVu;

    public Booking(String maBooking, String ngayBatDau, String ngayKetThuc,
                   String maKhachHang, String tenDichVu, String loaiDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;

    }

    public Booking() {
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }


    @Override
    public String toString() {
        return maBooking + '\t' + ngayBatDau + '\t' + ngayKetThuc + '\t' + maKhachHang + '\t' + tenDichVu + '\t' + loaiDichVu + '\t';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return maBooking.equals(booking.maBooking) &&
                ngayBatDau.equals(booking.ngayBatDau) &&
                ngayKetThuc.equals(booking.ngayKetThuc) &&
                maKhachHang.equals(booking.maKhachHang) &&
                tenDichVu.equals(booking.tenDichVu) &&
                loaiDichVu.equals(booking.loaiDichVu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maBooking, ngayBatDau, ngayKetThuc, maKhachHang, tenDichVu, loaiDichVu);
    }
}

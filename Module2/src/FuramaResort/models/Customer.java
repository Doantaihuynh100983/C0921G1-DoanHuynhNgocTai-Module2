package FuramaResort.models;

import java.time.LocalDateTime;

public class Customer extends Person{
        private String loaiKhach;
        private String diaChi;

    public Customer() {
    }

    public Customer(String id, String hoTen, String ngaySinh, String gioiTinh,
                    int soCmnd, int soDienThoai, String email, String loaiKhach, String diaChi) {
        super(id, hoTen, ngaySinh, gioiTinh, soCmnd, soDienThoai, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +"    id='" + getId() + '\'' +
                ",    hoTen='" + getHoTen() + '\'' +
                ",    ngaySinh='" + getNgaySinh() + '\'' +
                ",    gioiTinh='" + getGioiTinh() + '\'' +
                ",    soCmnd=" + getSoCmnd() +
                ",    soDienThoai=" + getSoDienThoai() +
                ",    email='" + getEmail() + '\'' +
                "     loaiKhach='" + getLoaiKhach() + '\'' +
                ",    diaChi='" + getDiaChi() + '\'' +
                '}';
    }
}

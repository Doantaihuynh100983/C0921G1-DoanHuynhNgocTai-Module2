package FuramaResort.models;

import java.time.LocalDateTime;

public class Customer extends Person{
        private String loaiKhach;
        private String diaChi;


    public Customer(String id, String hoTen, String ngaySinh, String gioiTinh, int soCmnd, int soDienThoai, String email) {
        super(id, hoTen, ngaySinh, gioiTinh, soCmnd, soDienThoai, email);
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
}

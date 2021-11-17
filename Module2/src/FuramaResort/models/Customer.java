package FuramaResort.models;

import java.time.LocalDateTime;

public class Customer extends Person{
        private String loaiKhach;
        private String diaChi;

    public Customer() {
    }

    public Customer(String hoTen, String ngaySinh, String gioiTinh,
                    int soCmnd, int soDienThoai, String email, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCmnd, soDienThoai, email);
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
        return getHoTen() + '\t' + getNgaySinh() + '\t' + getGioiTinh() + '\t' + getSoCmnd()+'\t' + getSoDienThoai()
                + getEmail() + '\t'+ getLoaiKhach() + '\t' + getDiaChi() ;
    }
}

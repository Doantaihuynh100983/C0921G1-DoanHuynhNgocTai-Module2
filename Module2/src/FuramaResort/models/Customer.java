package FuramaResort.models;

import java.io.Serializable;
import java.util.Objects;

public class Customer extends Person implements Serializable {
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }


    public Customer(String maSo, String hoTen, String ngaySinh, String gioiTinh, int soCmnd,
                    int soDienThoai, String email, String loaiKhach, String diaChi) {
        super(maSo, hoTen, ngaySinh, gioiTinh, soCmnd, soDienThoai, email);
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
        return getMaSo()+","+getHoTen()+","+getNgaySinh()+","+getGioiTinh()+","+getSoCmnd()+","+getSoDienThoai()
                +","+getEmail()+","+getLoaiKhach()+","+getDiaChi();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getMaSo(), customer.getMaSo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaSo());
    }
}

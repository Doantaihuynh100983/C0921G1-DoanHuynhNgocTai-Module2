package FuramaResort.models;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee() {
    }

    public Employee(String maSo, String hoTen, String ngaySinh, String gioiTinh, int soCmnd, int soDienThoai,
                    String email, String trinhDo, String viTri, double luong) {
        super(maSo, hoTen, ngaySinh, gioiTinh, soCmnd, soDienThoai, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return getMaSo() + " \t " + getHoTen() + '\t' + getNgaySinh() + '\t' + getGioiTinh() + '\t' + getSoCmnd() + '\t' +
                getSoDienThoai() + '\t' + getEmail() + '\t' + getTrinhDo() + '\t' + getViTri() + '\t' + getLuong();
    }
}

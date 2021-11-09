package FuramaResort.models;

import java.time.LocalDateTime;

public class Employee  extends  Person{
    private String trinhDo;
    private String viTri ;
    private double luong;

    public Employee() {
    }

    public Employee(String id, String hoTen, String ngaySinh, String gioiTinh, int soCmnd, int soDienThoai,
                    String email, String trinhDo, String viTri, double luong) {
        super(id, hoTen, ngaySinh, gioiTinh, soCmnd, soDienThoai, email);
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
        return "Employee{" +
                "      id='" + getId() + '\'' +
                ",     hoTen='" + getHoTen() + '\'' +
                ",     ngaySinh='" + getNgaySinh() + '\'' +
                ",     gioiTinh='" + getGioiTinh() + '\'' +
                ",     soCmnd=" + getSoCmnd() +
                ",     soDienThoai=" + getSoDienThoai() +
                ",     email='" + getEmail() + '\'' +
                "     trinhDo='" + getTrinhDo() + '\'' +
                ",    viTri='" + getViTri() + '\'' +
                ",    luong=" + getLuong() +

                '}';
    }
}

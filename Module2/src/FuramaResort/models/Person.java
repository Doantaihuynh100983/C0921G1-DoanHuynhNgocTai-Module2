package FuramaResort.models;

import java.io.Serializable;

public abstract class Person  implements Serializable {
    private String maSo;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private int soCmnd;
    private int soDienThoai;
    private String email;

    public Person() {
    }

    public Person(String maSo, String hoTen, String ngaySinh, String gioiTinh, int soCmnd, int soDienThoai, String email) {

        this.maSo = maSo;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCmnd = soCmnd;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(int soCmnd) {
        this.soCmnd = soCmnd;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    @Override
    public String toString() {
        return "Person{" + ", id ='" + maSo + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCmnd=" + soCmnd +
                ", soDienThoai=" + soDienThoai +
                ", email='" + email + '\'' +
                '}';
    }
}

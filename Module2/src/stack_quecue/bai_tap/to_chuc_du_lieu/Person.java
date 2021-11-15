package stack_quecue.bai_tap.to_chuc_du_lieu;

public class Person {
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;

    public Person() {
    }

    public Person(String hoTen, String gioiTinh, String ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                '}';
    }
}

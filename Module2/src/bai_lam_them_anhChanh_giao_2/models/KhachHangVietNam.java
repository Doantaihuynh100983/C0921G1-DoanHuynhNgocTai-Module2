package bai_lam_them_anhChanh_giao_2.models;

public class KhachHangVietNam extends QuanLyTienDien{
            private String loaiKhachHang;
            private int dinhMucTieuThu;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String maKhachHang, String hoTen, String loaiKhachHang, int dinhMucTieuThu) {
        super(maKhachHang, hoTen);
        this.loaiKhachHang = loaiKhachHang;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public double getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(int dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    @Override
    public String toString() {
        return   getMaKhachHang()+ "\t" +getHoTen()+ "\t" + loaiKhachHang + '\t' + dinhMucTieuThu ;
    }
}

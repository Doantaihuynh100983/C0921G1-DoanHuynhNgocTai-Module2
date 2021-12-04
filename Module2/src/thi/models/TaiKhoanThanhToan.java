package thi.models;

public class TaiKhoanThanhToan  extends  TaiKhoanNganHang{
    private int soThe;
    private double soTienTrongThe;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(String maNganHang, String tenChuTaiKhoan, String ngayTaoTaiKhoan, int soThe, double soTienTrongThe) {
        super(maNganHang, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongThe = soTienTrongThe;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public double getSoTienTrongThe() {
        return soTienTrongThe;
    }

    public void setSoTienTrongThe(double soTienTrongThe) {
        this.soTienTrongThe = soTienTrongThe;
    }

    @Override
    public String toString() {
        return getMaNganHang()+","+ getTenChuTaiKhoan()+","+getNgayTaoTaiKhoan()+","+soThe+","+soTienTrongThe ;
    }
}

package quan_ly_ngan_hang.models;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private int soThe;
    private double soTienTrongThe;

    public TaiKhoanThanhToan(int maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, int soThe, double soTienTrongThe) {
        super(maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongThe = soTienTrongThe;
    }

    public TaiKhoanThanhToan() {
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
        return getMaTaiKhoan() + "\t" + getTenChuTaiKhoan() + "\t" + getNgayTaoTaiKhoan() + "\t" + soThe + "\t" + soTienTrongThe;
    }

}

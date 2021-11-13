package quan_ly_ngan_hang.models;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
    private double soTienGuiTietKiem;
    private String ngayGuiTietKiem;
    private double laiSuat;
    private int kyHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(int maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
                            double soTienGuiTietKiem, String ngayGuiTietKiem, double laiSuat, int kyHan) {
        super(maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kyHan = kyHan;
    }

    public double getSoTienGuiTietKiem() {
        return soTienGuiTietKiem;
    }

    public void setSoTienGuiTietKiem(double soTienGuiTietKiem) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public int getKyHan() {
        return kyHan;
    }

    public void setKyHan(int kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return getMaTaiKhoan() + "\t" + getTenChuTaiKhoan() + "\t" + getNgayTaoTaiKhoan() + "\t" + soTienGuiTietKiem + "\t" + ngayGuiTietKiem + "\t" + laiSuat + "\t" + kyHan;
    }
}


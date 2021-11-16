package bai_lam_them_anhChanh_giao_2.models;

public class KhachHangNuocNgoai extends QuanLyTienDien{
    private String quocGia;

    public KhachHangNuocNgoai() {
    }
    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String quocGia) {
        super(maKhachHang, hoTen);
        this.quocGia = quocGia;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return  getMaKhachHang()+"\t"+ getHoTen()+"\t" + quocGia ;
    }
}

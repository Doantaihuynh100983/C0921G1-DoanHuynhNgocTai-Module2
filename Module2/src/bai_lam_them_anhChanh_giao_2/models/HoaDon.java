package bai_lam_them_anhChanh_giao_2.models;

public class HoaDon {
    private String maHoaDon;
    private String maKhachHang;
    private String ngayRaHonDon;
    private int soLuong;
    private int donGia;
    private double thanhTien;

    public HoaDon(String maHoaDon, String maKhachHang, String ngayRaHonDon, int soLuong, int donGia, double thanhTien) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.ngayRaHonDon = ngayRaHonDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public HoaDon() {
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayRaHonDon() {
        return ngayRaHonDon;
    }

    public void setNgayRaHonDon(String ngayRaHonDon) {
        this.ngayRaHonDon = ngayRaHonDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double thanhTienVietNam(){
            KhachHangVietNam khachHangVietNam = new KhachHangVietNam();
        if (getSoLuong() <= khachHangVietNam.getDinhMucTieuThu()){
            return getSoLuong()*getDonGia();
        }
        return (getSoLuong()*getDonGia()*khachHangVietNam.getDinhMucTieuThu())+(getSoLuong()*getDonGia()*2.5);
    }
    public double thanhTienNuocNgoai(){
        return getSoLuong()*getDonGia();
    }

    @Override
    public String toString() {
        return maHoaDon + '\t' + maKhachHang + '\t' + ngayRaHonDon + '\t' + soLuong +'\t' + donGia+ '\t' + thanhTien;

    }
}

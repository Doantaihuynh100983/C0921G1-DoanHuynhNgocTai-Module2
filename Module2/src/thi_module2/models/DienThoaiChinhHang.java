package thi_module2.models;

public class DienThoaiChinhHang  extends  DienThoai{
    private int thoiGianBaoHanh;
    private String phamViBanHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(String id, String tenDienThoai, double giaBan,
                              int soLuong, String nhaSanXuat, int thoiGianBaoHanh, String phamViBanHanh) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBanHanh = phamViBanHanh;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBanHanh() {
        return phamViBanHanh;
    }

    public void setPhamViBanHanh(String phamViBanHanh) {
        this.phamViBanHanh = phamViBanHanh;
    }

    @Override
    public String toString() {
        return getId()+","+getTenDienThoai()+","+getGiaBan()+","+getSoLuong()+","+getNhaSanXuat()+","+thoiGianBaoHanh+","+phamViBanHanh;
    }
}

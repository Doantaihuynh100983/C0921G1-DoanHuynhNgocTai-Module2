package thi_module2.models;

public class DienThoaiXachTay extends DienThoai{
    private String quocGiaXachTay;
    private String trangThai;
    private String soDu;

    public DienThoaiXachTay() {
    }


    public DienThoaiXachTay(String id, String tenDienThoai, double giaBan,
                            int soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai,String soDu) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
        this.soDu = soDu;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getSoDu() {
        return soDu;
    }

    public void setSoDu(String soDu) {
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return  getId()+","+getTenDienThoai()+","+getGiaBan()+","+getSoLuong()+","+getNhaSanXuat()+","+quocGiaXachTay+","+trangThai+","+soDu;
    }
}

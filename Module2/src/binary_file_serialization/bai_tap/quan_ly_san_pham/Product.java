package binary_file_serialization.bai_tap.quan_ly_san_pham;

import java.io.Serializable;

public class Product implements Serializable {
    private String maSanPham;
    private String tenSanPham;
    private String hangSanPham;
    private String gia;

    public Product(String maSanPham, String tenSanPham, String hangSanPham, String gia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanPham = hangSanPham;
        this.gia = gia;
    }

    public Product() {
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanPham() {
        return hangSanPham;
    }

    public void setHangSanPham(String hangSanPham) {
        this.hangSanPham = hangSanPham;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanPham='" + hangSanPham + '\'' +
                ", gia='" + gia + '\'' +
                '}';
    }
}

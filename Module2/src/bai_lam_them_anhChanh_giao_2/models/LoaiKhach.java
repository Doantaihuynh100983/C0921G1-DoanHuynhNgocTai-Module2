package bai_lam_them_anhChanh_giao_2.models;

import java.util.ArrayList;
import java.util.Scanner;

public class LoaiKhach {
    private String maDichVu;
    private String tenDichVu;

    public LoaiKhach() {
    }

    public LoaiKhach(String maDichVu, String tenDichVu) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    static ArrayList<LoaiKhach> loaiKhaches = new ArrayList<>();
            static {
                loaiKhaches.add(new LoaiKhach("LKH-001","Sinh hoạt"));
                loaiKhaches.add(new LoaiKhach("LKH-002","Kinh doanh"));
                loaiKhaches.add(new LoaiKhach("LKH-003","Sản xuất"));
            }

      public String loaiKhachHang(){
          Scanner sc = new Scanner(System.in);
          int chocie = sc.nextInt();
          return loaiKhaches.get(chocie-1).getTenDichVu();
      }
      public void menuLoaiKhachHang(){
          System.out.println("Mời chọn loại khác hàng \n " +
                  "1 . Sinh Hoạt \n" +
                  "2. Kinh Doanh \n" +
                  "3 Sản Xuất");
      }

    @Override
    public String toString() {
        return "LoaiKhach{" +
                "maDichVu='" + maDichVu + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                '}';
    }
}

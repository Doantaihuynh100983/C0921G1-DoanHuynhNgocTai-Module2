package bai_lam_them_anhChanh_giao_2.services;

import bai_lam_them_anhChanh_giao_2.models.KhachHangVietNam;
import bai_lam_them_anhChanh_giao_2.models.LoaiKhach;
import bai_lam_them_anhChanh_giao_2.models.QuanLyTienDien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhachHangVietNamImpl implements NganHang{
    LoaiKhach loaiKhach = new LoaiKhach();
    static List<QuanLyTienDien> khachHangVietNams = new ArrayList<>();
    static {
        khachHangVietNams.add(new KhachHangVietNam("KHVN-00001\t","Nguyễn Công Phượng", "sinh hoạt\t",100));
        khachHangVietNams.add(new KhachHangVietNam("KHVN-00002\t","Nguyễn Văn Toàn\t", "Kinh doanh\t",300));
        khachHangVietNams.add(new KhachHangVietNam("KHVN-00002\t","Nguyễn Tuấn Anh\t", "Sản xuất\t",500));
    }
    @Override
    public void add() {
        KhachHangVietNam khachHangVietNam = new KhachHangVietNam();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng ");
        khachHangVietNam.setMaKhachHang(sc.nextLine());
        System.out.println("Nhập họ và tên");
        khachHangVietNam.setHoTen(sc.nextLine());
        System.out.println("chọn loại khách hàng ");
        loaiKhach.menuLoaiKhachHang();
        khachHangVietNam.setLoaiKhachHang(loaiKhach.loaiKhachHang());
        System.out.println("Nhập định mức tiêu thụ");
        khachHangVietNam.setDinhMucTieuThu(Integer.parseInt(sc.nextLine()));

        khachHangVietNams.add(khachHangVietNam);
        disPlay();

    }

    @Override
    public void disPlay() {
            for (QuanLyTienDien khachHangVietNam : khachHangVietNams){
                System.out.println(khachHangVietNam);
            }
    }

    @Override
    public void search(String nameKhachHang) {
        for (int i = 0 ; i < khachHangVietNams.size(); i++){
            if (khachHangVietNams.get(i).getHoTen().equals(nameKhachHang)){
                System.out.println(khachHangVietNams.get(i));
            }
        }
    }

    @Override
    public boolean checkSearch(String nameKhachHang) {
        for (int i = 0 ; i < khachHangVietNams.size();i++){
            if (khachHangVietNams.get(i).getHoTen().equals(nameKhachHang)){
                    return true;
            }
        }
        return false;
    }

    public String khachHangVietNam(){
        Scanner scanner = new Scanner(System.in);
        disPlay();
        int choice = Integer.parseInt(scanner.nextLine());

        return khachHangVietNams.get(choice-1).getMaKhachHang();
    }
}

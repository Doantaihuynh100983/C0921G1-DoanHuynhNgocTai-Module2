package bai_lam_them_anhChanh_giao_2.services;

import bai_lam_them_anhChanh_giao_2.models.HoaDon;
import bai_lam_them_anhChanh_giao_2.models.KhachHangNuocNgoai;
import bai_lam_them_anhChanh_giao_2.models.KhachHangVietNam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoaDonImpl implements HoaDonService {
    KhachHangNuocNgoaiImpl khachHangNuocNgoai = new KhachHangNuocNgoaiImpl();
    KhachHangVietNamImpl khachHangVietNam = new KhachHangVietNamImpl();
    static List<HoaDon> hoaDons = new ArrayList<>();

    static {
        hoaDons.add(new HoaDon("MHD-001", "KHVN-00001", "12/12/2020", 10, 2000, 20000));
        hoaDons.add(new HoaDon("MHD-002", "KHVN-00001", "12/12/2020", 10, 2000, 20000));
        hoaDons.add(new HoaDon("MHD-003", "KHVN-00002", "12/12/2020", 10, 2000, 20000));
    }


    @Override
    public void addHoaDonVietNam() {
        Scanner scanner = new Scanner(System.in);
        HoaDon hoaDon = new HoaDon();

        System.out.println("Nhập mã hóa đơn");
        hoaDon.setMaHoaDon(scanner.nextLine());
        System.out.println("Chọn khách hàng");
        hoaDon.setMaKhachHang(khachHangVietNam.khachHangVietNam());
        System.out.println("Nhập ngày ra hóa đơn");
        hoaDon.setNgayRaHonDon(scanner.nextLine());
        System.out.println("Nhập số lượnng");
        hoaDon.setSoLuong(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập đơn giá");
        hoaDon.setDonGia(Integer.parseInt(scanner.nextLine()));
        hoaDon.setThanhTien(hoaDon.thanhTienVietNam());

        hoaDons.add(hoaDon);
        disPlayHoaDon();
    }

    //    String maKhachHang, String hoTen, String quocGia
    @Override
    public void addHoaDonNuocNgoai() {
        Scanner scanner = new Scanner(System.in);
        HoaDon hoaDon1 = new HoaDon();

        System.out.println("Nhập mã hóa đơn");
        hoaDon1.setMaHoaDon(scanner.nextLine());
        System.out.println("Chọn khách hàng");
        hoaDon1.setMaKhachHang(khachHangNuocNgoai.khachHangNuocNgoai());
        System.out.println("Nhập ngày ra hóa đơn");
        hoaDon1.setNgayRaHonDon(scanner.nextLine());
        System.out.println("Nhập số lượnng");
        hoaDon1.setSoLuong(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập đơn giá");
        hoaDon1.setDonGia(Integer.parseInt(scanner.nextLine()));
        hoaDon1.setThanhTien(hoaDon1.thanhTienNuocNgoai());

        hoaDons.add(hoaDon1);
        disPlayHoaDon();
    }

    @Override
    public void editHoaDon(String maHoaDon) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < hoaDons.size(); i++) {
            if (hoaDons.get(i).getMaHoaDon().equals(maHoaDon)) {
                System.out.println("Nhập mã hóa đơn");
                String maHoaDon1 = scanner.nextLine();
                System.out.println("Nhập mã khách hàng");
                String maKhachHang = scanner.nextLine();
                System.out.println("Nhập ngày ra hóa đơn");
                String ngay = scanner.nextLine();
                System.out.println("Nhập số lượnng");
                int soLuong = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập đơn giá");
                int gia = Integer.parseInt(scanner.nextLine());


                hoaDons.get(i).setMaHoaDon(maHoaDon1);
                hoaDons.get(i).setMaKhachHang(maKhachHang);
                hoaDons.get(i).setNgayRaHonDon(ngay);
                hoaDons.get(i).setSoLuong(soLuong);
                hoaDons.get(i).setDonGia(gia);
                break;


            }
        }
        disPlayHoaDon();
    }

    @Override
    public void disPlayHoaDon() {
        for (HoaDon hoaDon : hoaDons) {
            System.out.println(hoaDon);
        }
    }
}

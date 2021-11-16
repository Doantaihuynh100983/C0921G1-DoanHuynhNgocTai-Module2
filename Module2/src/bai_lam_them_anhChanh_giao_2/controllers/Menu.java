package bai_lam_them_anhChanh_giao_2.controllers;

import bai_lam_them_anhChanh_giao_2.services.HoaDonImpl;
import bai_lam_them_anhChanh_giao_2.services.KhachHangNuocNgoaiImpl;
import bai_lam_them_anhChanh_giao_2.services.KhachHangVietNamImpl;

import java.util.Scanner;

public class Menu {
    KhachHangVietNamImpl khachHangVietNam = new KhachHangVietNamImpl();
    KhachHangNuocNgoaiImpl khachHangNuocNgoai = new KhachHangNuocNgoaiImpl();
    HoaDonImpl hoaDon = new HoaDonImpl();

    public void menu() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice != 5) {

            System.out.println("1. Thêm mới khách hàng.");
            System.out.println("2. Hiện thị thông tin khách hàng");
            System.out.println("3. Tìm kiếm khách hàng");
            System.out.println("4. Thêm mới hóa đơn");
            System.out.println("5. Chỉnh sửa hóa đơn");
            System.out.println("6. Hiện thị thông  tin chi tiết hóa đơn");
            System.out.println("7. Thoát");

            System.out.println("Nhập từ 1 đến 7 để chọn chức năng");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int choice1 = 0;
                    while (choice1 != 4) {
                        System.out.println("1 Thêm Mới Khách Hàng Việt Nam ");
                        System.out.println("2 Thêm Mới Khách Hàng Nước Ngoài");
                        System.out.println("4 Return main menu");
                        System.out.println("Nhập từ 1 đến 4 để thứ");

                        choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.print(" ============================================ \n");
                                khachHangVietNam.add();
                                System.out.print("============================================ \n");
                                break;
                            case 2:
                                System.out.print("============================================\n");
                                khachHangNuocNgoai.add();
                                System.out.print("============================================\n");
                                break;
                            case 3:

                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Khách Hàng Việt Nam ");
                    khachHangVietNam.disPlay();
                    System.out.println("Khách Hang Nước Ngoài");
                    khachHangNuocNgoai.disPlay();
                    break;
                case 3:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Mời nhập tên cần tìm kiếm ");
                    String nameKhachHang = scanner.nextLine();
                    if (!(khachHangVietNam.checkSearch(nameKhachHang) || khachHangNuocNgoai.checkSearch(nameKhachHang))) {
                        System.out.println("Không có trong danh sách khách hàng");
                    } else if (khachHangVietNam.checkSearch(nameKhachHang) || khachHangNuocNgoai.checkSearch(nameKhachHang)) {
                        khachHangVietNam.search(nameKhachHang);
                        khachHangNuocNgoai.search(nameKhachHang);
                    }
                    break;
                case 4 :
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Mời chọn hóa khách hàng cần thêm hóa đơn\n" +
                            "1.Khách hàng việt nam\n" +
                            "2.Khách hàng nước ngoài");
                    int chocie2 = Integer.parseInt(scanner1.nextLine());
                    if (chocie2==1){
                        hoaDon.addHoaDonVietNam();
                    }else if (chocie2 == 2 ){
                        hoaDon.addHoaDonNuocNgoai();
                    }
                    break;
                case 5 :
                    Scanner scanner2 = new Scanner(System.in);
                        String maKhachHang = scanner2.nextLine();
                   hoaDon.editHoaDon(maKhachHang);
                    break;
                case 6 :
                    hoaDon.disPlayHoaDon();
                    break;
                case 7 :
                    System.exit(0);
                    break;
            }
        }
    }
}
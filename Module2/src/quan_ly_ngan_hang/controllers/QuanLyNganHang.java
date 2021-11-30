package quan_ly_ngan_hang.controllers;

import quan_ly_ngan_hang.models.TaiKhoanThanhToan;
import quan_ly_ngan_hang.models.TaiKhoanTietKiem;
import quan_ly_ngan_hang.servcie.TaiKhoanThanhToanImpl;
import quan_ly_ngan_hang.servcie.TaiKhoanTietKiemImpl;
import quan_ly_ngan_hang.validate.NotFoundBankAccountException;

import java.util.Scanner;

public class QuanLyNganHang {
    TaiKhoanThanhToanImpl taiKhoanThanhToan = new TaiKhoanThanhToanImpl();
    TaiKhoanTietKiemImpl taiKhoanTietKiem = new TaiKhoanTietKiemImpl();
    TaiKhoanThanhToan taiKhoanThanhToans = new TaiKhoanThanhToan();

    public void menu() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice != 5) {

            System.out.println("1. Thêm mới thẻ ngân hàng.");
            System.out.println("2. Xóa thẻ ngân hàng");
            System.out.println("3. Xem danh sách các tài khoản ngân hàng");
            System.out.println("4. Tìm Kiếm");
            System.out.println("5. Thoát");

            System.out.println("Nhập từ 1 đến 5 để chọn chức năng");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int choice1 = 0;
                    while (choice1 != 3) {
                        System.out.println("1 Thêm mới tài khoản thanh toán");
                        System.out.println("2 Thêm mới tài khoản tiết kiệm");
                        System.out.println("3. Quay lại menu chính");
                        System.out.println("Nhập từ 1 đến 3 để thứ");

                        choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                taiKhoanThanhToan.add();
                                break;
                            case 2:
                                taiKhoanTietKiem.add();
                                break;
                            case 3:

                                break;
                        }
                    }
                    break;
                case 2:
//                    Scanner scanner = new Scanner(System.in);
//                    System.out.println("nhập mã ngân hàng cần xóa bỏ");
//                    String maNganHang = scanner.nextLine();
//                    System.out.println("1 Yes \n 2 No");
//                    int chon = scanner.nextInt();
//                    if (taiKhoanThanhToan.checkDelete(maNganHang) || taiKhoanTietKiem.checkDelete(maNganHang)) {
//                        if (chon == 1) {
//                            taiKhoanThanhToan.delete(maNganHang);
//                            taiKhoanTietKiem.delete(maNganHang);
//                            System.out.println("Đã Xóa Thành Công");
//                            break;
//                        } else if (chon == 2) {
//                            break;
//                        }
//
//                    }


                    break;
                case 3:
                    System.out.println("danh sách");
                    System.out.print("============================================\n");
                    System.out.println("Tài khoản thanh toán");
                    System.out.print("============================================\n");
                    taiKhoanThanhToan.disPlay();
                    System.out.print("============================================\n");
                    System.out.print("============================================\n");
                    System.out.println("Tài khoản tiết kiệm");
                    System.out.print("============================================\n");
                    taiKhoanTietKiem.disPlay();
                    System.out.print("============================================\n");
                    break;
                case 4:
                    System.out.println("tìm kiếm");
                    System.out.println("1. Tìm kiếm theo tên\n" +
                            "2.Tìm kiếm theo mã số thẻ ");
                    Scanner scanner1 = new Scanner(System.in);
                    int choice2 = Integer.parseInt(scanner1.nextLine());
                    switch (choice2) {
                        case 1:
                            System.out.println("Nhập tên cần tìm kiếm");
                            String tenChuTaiKhoan = scanner1.nextLine();
                            if (taiKhoanThanhToan.checkSearch(tenChuTaiKhoan) || taiKhoanTietKiem.checkSearch(tenChuTaiKhoan)||taiKhoanThanhToan.checkDelete(tenChuTaiKhoan) || taiKhoanTietKiem.checkDelete(tenChuTaiKhoan) ) {
                                taiKhoanThanhToan.search(tenChuTaiKhoan);
                                taiKhoanTietKiem.search(tenChuTaiKhoan);
                            }
                            break;
                        case 2:
//                            System.out.println("Nhập mã cần tìm kiếm");
//                            int maTaiKhoan = scanner1.nextInt();
//                            if (taiKhoanThanhToan.checkDelete(maTaiKhoan) || taiKhoanTietKiem.checkDelete(maTaiKhoan)) {
//                                taiKhoanThanhToan.search(maTaiKhoan);
//                                taiKhoanTietKiem.search(maTaiKhoan);
//                            }
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}

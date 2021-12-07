package thi.controllers;

import thi.vallidate.NotFoundBankAccountException;
import thi.vallidate.Vallidate;
import thi.service.QuanLyNganHangSerrvce;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QuanLyNganHangSerrvce quanLyNganHangSerrvce = new QuanLyNganHangSerrvce();
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
                                quanLyNganHangSerrvce.addTietKiem();
                                break;
                            case 2:
                                quanLyNganHangSerrvce.addThanhToan();
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 2:
                    Vallidate vallidate = new Vallidate();
                    Scanner scanner = new Scanner(System.in);
                    while (true){
                        try {
                        String  maNganHang = vallidate.maTaiKhoanCanXoa();
                        System.out.println("1 Yes \n 2 No");
                        int chon = scanner.nextInt();
                        if (quanLyNganHangSerrvce.checkSearchMaNganHang(maNganHang)) {
                            if (chon == 1) {
                                quanLyNganHangSerrvce.delete(maNganHang);
                                System.err.println("Đã Xóa Thành Công");
                                break;
                            } else if (chon == 2) {
                                break;
                            }

                        }

                    } catch (NotFoundBankAccountException e) {
                            System.err.println("Không tồn tại !!!!");
                    }
                    }
                    break;
                case 3:
                    quanLyNganHangSerrvce.disPlay();
                    break;
                case 4:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập tên hoặc mã số ngân hàng cần tìm kiếm !!!");
                    String timKiem = scanner1.nextLine();
                    quanLyNganHangSerrvce.search(timKiem);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
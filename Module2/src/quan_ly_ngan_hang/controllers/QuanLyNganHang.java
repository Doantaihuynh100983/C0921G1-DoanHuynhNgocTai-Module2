package quan_ly_ngan_hang.controllers;

        import quan_ly_ngan_hang.servcie.TaiKhoanThanhToanImpl;
        import quan_ly_ngan_hang.servcie.TaiKhoanTietKiemImpl;

        import java.util.Scanner;

public class QuanLyNganHang {
    TaiKhoanThanhToanImpl taiKhoanThanhToan = new TaiKhoanThanhToanImpl();
    TaiKhoanTietKiemImpl taiKhoanTietKiem = new TaiKhoanTietKiemImpl();

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
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("nhập mã ngân hàng cần xóa bỏ");
                    int maNganHang = scanner.nextInt();
                    System.out.println("1 Yes \n 2 No");
                    int chon = scanner.nextInt();
                    if (taiKhoanThanhToan.checkDelete(maNganHang) || taiKhoanTietKiem.checkDelete(maNganHang)) {
                        if (chon == 1) {
                            taiKhoanThanhToan.delete(maNganHang);
                            taiKhoanTietKiem.delete(maNganHang);
                            break;
                        } else if (chon == 2) {
                            break;
                        }

                    }
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
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
package quan_ly_ngan_hang.validate;

import java.util.Scanner;

public class Validate {


    Scanner scanner = new Scanner(System.in);

    public int maTaiKhoan() {
        int maTaiKhoan;
        while (true) {
            try {
                System.out.println("Nhập mã tài khoản");
                maTaiKhoan = Integer.parseInt(scanner.nextLine());
                if (maTaiKhoan > 0) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return maTaiKhoan;
    }


    public String tenChuTaiKhoan() {
        String tenChuTaiKhoan;
        while (true) {
            try {
                System.out.println("nhập tên chủ tài khoản");
                tenChuTaiKhoan = scanner.nextLine();
                if (!tenChuTaiKhoan.trim().equals("")) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return tenChuTaiKhoan;
    }


    public String ngayTaoTaiKhoan() {
        String ngayTaoTaiKhoan;
        while (true) {
            try {
                System.out.println("nhập ngày tạo tài khoản");
                ngayTaoTaiKhoan = scanner.nextLine();
                if (!ngayTaoTaiKhoan.trim().equals("")) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return ngayTaoTaiKhoan;
    }


    public int soThe() throws NotFoundBankAccountException{
        int soThe;
        while (true) {
            try {
                System.out.println("nhập số thẻ");
                soThe = Integer.parseInt(scanner.nextLine());
                if (soThe > 0) {
                    break;
                }
                else {
                    throw new NotFoundBankAccountException();
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return soThe;
    }


    public double soTienTrongThe() {
        double soTienTrongThe;
        while (true) {
            try {
                System.out.println("nhập số tiền trong thẻ");
                soTienTrongThe = Double.parseDouble(scanner.nextLine());
                if (soTienTrongThe > 0) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return soTienTrongThe;
    }


    public double soTienGuiTietKiem() {
        double soTienGuiTietKiem;
        while (true) {
            try {
                System.out.println("nhập số tiền gửi tiết kiệm");
                soTienGuiTietKiem = Double.parseDouble(scanner.nextLine());
                if (soTienGuiTietKiem > 0) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return soTienGuiTietKiem;
    }


    public String ngayGuiTietKiem() {
        String ngayGuiTietKiem;
        while (true) {
            try {
                System.out.println("nhập ngày gửi tiết kiệm");
                ngayGuiTietKiem = scanner.nextLine();
                if (!ngayGuiTietKiem.trim().equals("")) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return ngayGuiTietKiem;
    }


    public double laiSuat() {
        double laiSuat;
        while (true) {
            try {
                System.out.println("nhập lãi xuất");
                laiSuat = Double.parseDouble(scanner.nextLine());
                if (laiSuat > 0) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return laiSuat;
    }

    public int kyHan() {
        int kyHan;
        while (true) {
            try {
                System.out.println("nhập kỳ hạn");
                kyHan = Integer.parseInt(scanner.nextLine());
                if (kyHan > 0) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return kyHan;
    }
}

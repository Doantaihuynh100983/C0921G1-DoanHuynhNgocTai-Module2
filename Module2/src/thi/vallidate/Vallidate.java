package thi.vallidate;

import thi.service.QuanLyNganHangSerrvce;

import java.util.Scanner;

public class Vallidate {
    Scanner scanner = new Scanner(System.in);
    QuanLyNganHangSerrvce quanLyNganHangSerrvce = new QuanLyNganHangSerrvce();
    public String maTaiKhoanCanXoa() throws NotFoundBankAccountException {
        String maTaiKhoan;
        while (true) {
            try {
                System.out.println("Nhập mã tài khoản cần xóa");
                maTaiKhoan = scanner.nextLine();
                if (quanLyNganHangSerrvce.checkSearchMaNganHang(maTaiKhoan)) {
                    break;
                } else {
                  throw new NotFoundBankAccountException();
                }
            } catch (Exception e) {
                System.err.println("Tài khoản không tồn tại.");
            }
        }
        return maTaiKhoan;
    }

}

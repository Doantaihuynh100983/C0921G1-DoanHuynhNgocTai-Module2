package thi.vallidate;

import thi.models.TaiKhoanNganHang;
import thi.service.QuanLyNganHangSerrvce;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Vallidate {
    Scanner scanner = new Scanner(System.in);
    QuanLyNganHangSerrvce quanLyNganHangSerrvce = new QuanLyNganHangSerrvce();
    public String maTaiKhoanCanXoa() throws NotFoundBankAccountException {
        String maTaiKhoan;
        while (true) {
                System.out.println("Nhập mã tài khoản cần xóa");
                maTaiKhoan = scanner.nextLine();
                if (quanLyNganHangSerrvce.checkSearchMaNganHang(maTaiKhoan)) {
                    break;
                } else {
                  throw new NotFoundBankAccountException();
                }
        }
        return maTaiKhoan;
    }
}

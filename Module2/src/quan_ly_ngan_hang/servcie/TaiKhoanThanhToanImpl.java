package quan_ly_ngan_hang.servcie;


import quan_ly_ngan_hang.models.TaiKhoanTietKiem;
import quan_ly_ngan_hang.validate.Validate;
import quan_ly_ngan_hang.models.TaiKhoanThanhToan;
import quan_ly_ngan_hang.servcie.servcieimpl.TaiKhoanThanhToanSevice;

import java.util.ArrayList;
import java.util.Stack;

public class TaiKhoanThanhToanImpl implements TaiKhoanThanhToanSevice {
    Validate valiDate = new Validate();
    static ArrayList<TaiKhoanThanhToan> taiKhoanThanhToans = new ArrayList<>();

    static {
        taiKhoanThanhToans.add(new TaiKhoanThanhToan(496, "Tài Đoàn", "30/10/2021", 2062549999, 50.000000000));
        taiKhoanThanhToans.add(new TaiKhoanThanhToan(5611, "Minh Ca ", "31/11/2021", 333666655, 50.000000000));
        taiKhoanThanhToans.add(new TaiKhoanThanhToan(1234, "Văn Tiến ", "30/10/2020", 44455566, 50.000000000));
    }

    @Override
    public void add() {
        TaiKhoanThanhToan newTaiKhoanThanhToan = new TaiKhoanThanhToan();
        newTaiKhoanThanhToan.setMaTaiKhoan(valiDate.maTaiKhoan());
        newTaiKhoanThanhToan.setTenChuTaiKhoan(valiDate.tenChuTaiKhoan());
        newTaiKhoanThanhToan.setNgayTaoTaiKhoan(valiDate.ngayTaoTaiKhoan());
        newTaiKhoanThanhToan.setSoThe(valiDate.soThe());
        newTaiKhoanThanhToan.setSoTienTrongThe(valiDate.soTienTrongThe());

        taiKhoanThanhToans.add(newTaiKhoanThanhToan);


    }

    @Override
    public void delete(int maNganHang) {
        for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
            if (maNganHang == taiKhoanThanhToans.get(i).getMaTaiKhoan()) {
                taiKhoanThanhToans.remove(taiKhoanThanhToans.get(i));
            }
        }
    }

    @Override
    public void disPlay() {
        int id = 1;
        for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToans) {
            System.out.print(id++ + "\t");
            System.out.println(taiKhoanThanhToan);
        }
    }

    @Override
    public void search(int maNganHang) {
        for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
            if (maNganHang == taiKhoanThanhToans.get(i).getMaTaiKhoan()) {
                System.out.println(taiKhoanThanhToans.get(i));
            }
        }


    }

    @Override
    public void search(String tenChuTaiKhoan) {
        for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
            if ((taiKhoanThanhToans.get(i).getTenChuTaiKhoan().contains(tenChuTaiKhoan))) {
                System.out.println(taiKhoanThanhToans.get(i));
            }
        }
    }


    @Override
    public boolean checkDelete(int maNganHang) {
        for (TaiKhoanThanhToan thanhToan : taiKhoanThanhToans) {
            if (maNganHang == thanhToan.getMaTaiKhoan()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkSearch(String tenChuTaiKhoan) {
        for (TaiKhoanThanhToan thanhToan : taiKhoanThanhToans) {
            if (thanhToan.getTenChuTaiKhoan().contains(tenChuTaiKhoan)) {
                return true;
            }
        }
        return false;
    }


}

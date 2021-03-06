package quan_ly_ngan_hang.servcie;


import quan_ly_ngan_hang.validate.NotFoundBankAccountException;
import quan_ly_ngan_hang.validate.Validate;
import quan_ly_ngan_hang.models.TaiKhoanThanhToan;
import quan_ly_ngan_hang.servcie.servcieimpl.TaiKhoanThanhToanSevice;

import java.util.ArrayList;

public class TaiKhoanThanhToanImpl implements TaiKhoanThanhToanSevice {
    static ArrayList<TaiKhoanThanhToan> taiKhoanThanhToans = new ArrayList<>();

    static {
        taiKhoanThanhToans.add(new TaiKhoanThanhToan(496, "Tài Đoàn", "30/10/2021", 2062549999, 50.000000000));
        taiKhoanThanhToans.add(new TaiKhoanThanhToan(5611, "Minh Ca ", "31/11/2021", 333666655, 50.000000000));
        taiKhoanThanhToans.add(new TaiKhoanThanhToan(1234, "Văn Tiến ", "30/10/2020", 44455566, 50.000000000));
    }

    @Override
    public void add() {
        TaiKhoanThanhToan newTaiKhoanThanhToan = new TaiKhoanThanhToan();
        newTaiKhoanThanhToan.setMaTaiKhoan(Validate.maTaiKhoan());
        newTaiKhoanThanhToan.setTenChuTaiKhoan(Validate.tenChuTaiKhoan());
        newTaiKhoanThanhToan.setNgayTaoTaiKhoan(Validate.ngayTaoTaiKhoan());
        try {
            newTaiKhoanThanhToan.setSoThe(Validate.soThe());
        } catch (NotFoundBankAccountException e) {
            e.printStackTrace();
        }
        newTaiKhoanThanhToan.setSoTienTrongThe(Validate.soTienTrongThe());

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
    public boolean checkDelete(String maNganHang) {
        for (TaiKhoanThanhToan thanhToan : taiKhoanThanhToans) {
            if (maNganHang.equals(thanhToan.getMaTaiKhoan())) {
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

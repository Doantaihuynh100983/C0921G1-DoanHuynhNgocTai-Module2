package quan_ly_ngan_hang.servcie;

import quan_ly_ngan_hang.models.TaiKhoanTietKiem;
import quan_ly_ngan_hang.servcie.servcieimpl.TaiKhoanTietKiemSevice;
import quan_ly_ngan_hang.validate.Validate;

import java.util.ArrayList;

public class TaiKhoanTietKiemImpl implements TaiKhoanTietKiemSevice {
    static ArrayList<TaiKhoanTietKiem> taiKhoanTietKiems = new ArrayList<>();

    static {
        taiKhoanTietKiems.add(new TaiKhoanTietKiem(496, "Huyền", "30/5/2014", 50.000, "6/5/2019", 5.2, 6));
        taiKhoanTietKiems.add(new TaiKhoanTietKiem(569, "Thắng", "23/12/2013", 60.000, "16/6/2025", 5.6, 12));
        taiKhoanTietKiems.add(new TaiKhoanTietKiem(888, "Dương", "6/5/2020", 80.000, "14/5/2010", 4.0, 3));
    }

    @Override
    public void add() {
        TaiKhoanTietKiem newTaiKhoanTietKiem = new TaiKhoanTietKiem();
        newTaiKhoanTietKiem.setMaTaiKhoan(Validate.maTaiKhoan());
        newTaiKhoanTietKiem.setTenChuTaiKhoan(Validate.tenChuTaiKhoan());
        newTaiKhoanTietKiem.setNgayTaoTaiKhoan(Validate.ngayTaoTaiKhoan());
        newTaiKhoanTietKiem.setSoTienGuiTietKiem(Validate.soTienGuiTietKiem());
        newTaiKhoanTietKiem.setNgayGuiTietKiem(Validate.ngayGuiTietKiem());
        newTaiKhoanTietKiem.setLaiSuat(Validate.laiSuat());
        newTaiKhoanTietKiem.setKyHan(Validate.kyHan());

        taiKhoanTietKiems.add(newTaiKhoanTietKiem);


    }

    @Override
    public void delete(int maNganHang) {
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if (maNganHang == taiKhoanTietKiems.get(i).getMaTaiKhoan()) {
                taiKhoanTietKiems.remove(taiKhoanTietKiems.get(i));
            }
        }
    }

    @Override
    public void disPlay() {
        int id = 1;
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiems) {
            System.out.print(id++ + "\t");
            System.out.println(taiKhoanTietKiem);
        }
    }

    @Override
    public void search(int maNganHang) {
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if (maNganHang == taiKhoanTietKiems.get(i).getMaTaiKhoan()) {
                System.out.println(taiKhoanTietKiems.get(i));
            }
        }
    }
    @Override
    public void search(String tenChuTaiKhoan) {
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if ((taiKhoanTietKiems.get(i).getTenChuTaiKhoan().contains(tenChuTaiKhoan))) {
                System.out.println(taiKhoanTietKiems.get(i));
            }
        }
    }

    @Override
    public boolean checkDelete(String maNganHang) {
        for (TaiKhoanTietKiem tietkiem : taiKhoanTietKiems) {
            if (maNganHang.equals(tietkiem.getMaTaiKhoan())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkSearch(String tenChuTaiKhoan) {
        for (TaiKhoanTietKiem thanhToan : taiKhoanTietKiems) {
            if (tenChuTaiKhoan.contains(thanhToan.getTenChuTaiKhoan())) {
                return true;
            }
        }
        return false;
    }


}

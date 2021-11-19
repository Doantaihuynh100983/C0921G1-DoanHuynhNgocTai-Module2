package quan_ly_ngan_hang.servcie;

import quan_ly_ngan_hang.models.TaiKhoanTietKiem;
import quan_ly_ngan_hang.servcie.servcieimpl.TaiKhoanTietKiemSevice;
import quan_ly_ngan_hang.validate.Validate;

import java.util.ArrayList;

public class TaiKhoanTietKiemImpl implements TaiKhoanTietKiemSevice {
    Validate valiDate = new Validate();
    static ArrayList<TaiKhoanTietKiem> taiKhoanTietKiems = new ArrayList<>();

    static {
        taiKhoanTietKiems.add(new TaiKhoanTietKiem(496, "Huyền", "30/5/2014", 50.000, "6/5/2019", 5.2, 6));
        taiKhoanTietKiems.add(new TaiKhoanTietKiem(569, "Thắng", "23/12/2013", 60.000, "16/6/2025", 5.6, 12));
        taiKhoanTietKiems.add(new TaiKhoanTietKiem(888, "Dương", "6/5/2020", 80.000, "14/5/2010", 4.0, 3));
    }

    @Override
    public void add() {
        TaiKhoanTietKiem newTaiKhoanTietKiem = new TaiKhoanTietKiem();
        newTaiKhoanTietKiem.setMaTaiKhoan(valiDate.maTaiKhoan());
        newTaiKhoanTietKiem.setTenChuTaiKhoan(valiDate.tenChuTaiKhoan());
        newTaiKhoanTietKiem.setNgayTaoTaiKhoan(valiDate.ngayTaoTaiKhoan());
        newTaiKhoanTietKiem.setSoTienGuiTietKiem(valiDate.soTienGuiTietKiem());
        newTaiKhoanTietKiem.setNgayGuiTietKiem(valiDate.ngayGuiTietKiem());
        newTaiKhoanTietKiem.setLaiSuat(valiDate.laiSuat());
        newTaiKhoanTietKiem.setKyHan(valiDate.kyHan());

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
    public boolean checkDelete(int maNganHang) {
        for (TaiKhoanTietKiem tietkiem : taiKhoanTietKiems) {
            if (maNganHang == tietkiem.getMaTaiKhoan()) {
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

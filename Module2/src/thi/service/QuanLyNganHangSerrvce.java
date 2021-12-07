package thi.service;

import FuramaResort.common.WriteReadFile;
import thi.common.ReadWirteFile;
import thi.models.TaiKhoanNganHang;
import thi.models.TaiKhoanThanhToan;
import thi.models.TaiKhoanTietKiem;

import java.util.*;

public class QuanLyNganHangSerrvce implements QuanLyNganHang {
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_NAME = "Module2/src/thi/data/bank_accounts.csv";
    List<TaiKhoanNganHang> taiKhoanNganHangs = new ArrayList<>();

    //    static {
//        taiKhoanNganHangs.add(new TaiKhoanTietKiem("003456781", "Nguyen Van An", "04/05/2020", 15000000, "05/05/2020", 5, 6));
//        taiKhoanNganHangs.add(new TaiKhoanThanhToan("003456783", "Nguyen Van Binh", "04/05/2020", 97042303, 5000000));
//    }
    {
        taiKhoanNganHangs = covertStringToEmployee();
    }

    @Override
    public void addTietKiem() {
        TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem();
        System.out.println("Nhập mã ngân hàng");
        taiKhoanTietKiem.setMaNganHang(scanner.nextLine());
        System.out.println("Nhập tên chủ ngân hàng");
        taiKhoanTietKiem.setTenChuTaiKhoan(scanner.nextLine());
        System.out.println("Nhập ngày tạo tài khoản");
        taiKhoanTietKiem.setNgayTaoTaiKhoan(scanner.nextLine());
        System.out.println("Nhập số tiền gửi");
        taiKhoanTietKiem.setSoTienGuiTietKiem(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập ngày gửi tiết kiệm");
        taiKhoanTietKiem.setNgayGuiTietKiem(scanner.nextLine());
        System.out.println("Nhập lãi xuất");
        taiKhoanTietKiem.setLaiSuat(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập kì hạn");
        taiKhoanTietKiem.setLaiSuat(Integer.parseInt(scanner.nextLine()));

        taiKhoanNganHangs.add(taiKhoanTietKiem);
        List<String> stringList = new ArrayList<>();
        stringList.add(taiKhoanTietKiem.toString());
        ReadWirteFile.writeFile(FILE_NAME, stringList, true);
    }


    @Override
    public void addThanhToan() {
        TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan();
        System.out.println("Nhập mã ngân hàng");
        taiKhoanThanhToan.setMaNganHang(scanner.nextLine());
        System.out.println("Nhập tên chủ ngân hàng");
        taiKhoanThanhToan.setTenChuTaiKhoan(scanner.nextLine());
        System.out.println("Nhập ngày tạo tài khoản");
        taiKhoanThanhToan.setNgayTaoTaiKhoan(scanner.nextLine());
        System.out.println("Nhập số thẻ");
        taiKhoanThanhToan.setSoThe(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập số tiền trong thẻ");
        taiKhoanThanhToan.setSoTienTrongThe(Double.parseDouble(scanner.nextLine()));

        taiKhoanNganHangs.add(taiKhoanThanhToan);
        List<String> stringList = new ArrayList<>();
        stringList.add(taiKhoanThanhToan.toString());
        ReadWirteFile.writeFile(FILE_NAME, stringList, true);
    }

    @Override
    public void disPlay() {
        int id = 1;
        for (TaiKhoanNganHang taiKhoanNganHang : taiKhoanNganHangs) {
            System.out.print(id++ + " -- ");
            System.out.println(taiKhoanNganHang);

        }
    }

    @Override
    public void delete(String ma) {
        for (int i = 0; i < taiKhoanNganHangs.size(); i++) {
            if (taiKhoanNganHangs.get(i).getMaNganHang().equals(ma)){
                taiKhoanNganHangs.remove(taiKhoanNganHangs.get(i));
            }

        }
        List<String> stringList = covertEmployeeToString();
        ReadWirteFile.writeFile(FILE_NAME, stringList, false);
    }

    @Override
    public void search(String tenNganHang) {
        for (int i = 0; i < taiKhoanNganHangs.size(); i++) {
            if (checkSearchName(tenNganHang) || checkSearchMaNganHang(tenNganHang)) {
                if (taiKhoanNganHangs.get(i).getTenChuTaiKhoan().contains(tenNganHang)
                        || taiKhoanNganHangs.get(i).getMaNganHang().contains(tenNganHang))
                    System.out.println(taiKhoanNganHangs.get(i));
            }
        }
    }

    @Override
    public boolean checkSearchName(String name) {
        for (TaiKhoanNganHang taiKhoanNganHang : taiKhoanNganHangs) {
            if (taiKhoanNganHang.getTenChuTaiKhoan().contains(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkSearchMaNganHang(String ma) {
        for (TaiKhoanNganHang taiKhoanNganHang : taiKhoanNganHangs) {
            if (taiKhoanNganHang.getMaNganHang().contains(ma)) {
                return true;
            }
        }
        return false;
    }


    public List<TaiKhoanNganHang> covertStringToEmployee() {
        List<String> stringList = WriteReadFile.readFile(FILE_NAME);
        List<TaiKhoanNganHang> taiKhoanNganHangs = new ArrayList<>();
        String[] arrTaiKhoanNganHang;
        for (String line : stringList) {
            arrTaiKhoanNganHang = line.split(",");
            if (arrTaiKhoanNganHang.length == 5) {
                taiKhoanNganHangs.add(new TaiKhoanThanhToan(arrTaiKhoanNganHang[0], arrTaiKhoanNganHang[1], arrTaiKhoanNganHang[2],
                        Integer.parseInt(arrTaiKhoanNganHang[3]), Double.parseDouble(arrTaiKhoanNganHang[4])));
            }

            if (arrTaiKhoanNganHang.length == 7) {
                taiKhoanNganHangs.add(new TaiKhoanTietKiem(arrTaiKhoanNganHang[0], arrTaiKhoanNganHang[1], arrTaiKhoanNganHang[2],
                        Double.parseDouble(arrTaiKhoanNganHang[3]), arrTaiKhoanNganHang[4], Double.parseDouble(arrTaiKhoanNganHang[5])
                        , Integer.parseInt(arrTaiKhoanNganHang[6])));
            }
            
        }
        return taiKhoanNganHangs;
    }

    public List<String> covertEmployeeToString() {
        List<String> listString = new LinkedList<>();
        for (TaiKhoanNganHang taiKhoanNganHang : taiKhoanNganHangs) {
            listString.add(taiKhoanNganHang.toString());
        }
        return listString;
    }



}
